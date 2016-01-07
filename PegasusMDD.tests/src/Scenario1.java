import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import RootElement.Booking.BookingFactory;
import RootElement.Booking.Cart;
import RootElement.Booking.CartManagement;
import RootElement.CheckIO.CheckIO;
import RootElement.CheckIO.CheckIOFactory;
import RootElement.Room.Room;
import RootElement.Room.RoomFactory;
import RootElement.Room.RoomManagement;
import RootElement.Room.RoomType;
import RootElement.Room.RoomTypeManagment;
import RootElement.Schedule.AvailablityMap;
import RootElement.Schedule.RoomSchedule;
import RootElement.Schedule.ScheduleFactory;

public class Scenario1 {
	CartManagement cm;
	Cart cart;
	RoomManagement rm;
	RoomTypeManagment rtm;
	RoomSchedule scdl;
	CheckIO check;
	
	@Before
	public void setUp() throws Exception {
		cm = BookingFactory.eINSTANCE.createCartManagement();
		cm.setCurrentCart(BookingFactory.eINSTANCE.createCart());
		cm.setRoomTypeManagement(RoomFactory.eINSTANCE.createRoomTypeManagment());
		rtm = cm.getRoomTypeManagement();
		cart = cm.getCurrentCart();
		rm = RoomFactory.eINSTANCE.createRoomManagement();
		cm.setRoomSchedule(ScheduleFactory.eINSTANCE.createRoomSchedule());
		scdl = cm.getRoomSchedule();
		
		check = CheckIOFactory.eINSTANCE.createCheckIO();
		check.setCartManagement(cm);
		check.setRoomManagement(rm);
	}

	@Test
	public void test() {
		// add a room type into the system
		int roomTypeID = rtm.addRoomType("single", 50, 1);
		RoomType roomType = rtm.getRoomType(roomTypeID);
		
		// add a room into the system
		Room room = RoomFactory.eINSTANCE.createRoom();
		room.setAvailable(true);
		room.setFloorNumber(1);
		room.setRoomNumber(1);
		room.setRoomType(roomType);
		rm.addRoom(room);
		
		// register the room into the schedule calendar
		AvailablityMap av = ScheduleFactory.eINSTANCE.createAvailablityMap(); 
		av.setAvailable(1);
		Calendar calendar = Calendar.getInstance();
		calendar.set(2016, 1, 8);
		Date ddl = calendar.getTime(); 
		av.setDate(ddl);
		av.setRoomType(roomType);
		scdl.getSchedule().add(av);
		
		calendar.set(2016, 1, 7);
		Date checkIn = calendar.getTime();
		
		calendar.set(2016, 1, 9);
		Date checkOut = calendar.getTime();
		
		int nrOfRooms = 1;
		int bookingID = cm.addBooking(roomTypeID, checkIn, checkOut, nrOfRooms);
		
		// switched order of dates to cause an error
		assertFalse(cm.editBooking(bookingID, roomTypeID, checkOut, checkIn, nrOfRooms));
		
		assertNotNull(cm.getBooking(bookingID));
		
		assertTrue(check.CheckIn(bookingID));
		
		int fakeID = 10;
		
		assertFalse(check.CheckIn(fakeID));
		
		assertTrue(check.CheckOut(bookingID));
		
		assertFalse(check.CheckOut(fakeID));
		
		assertTrue(cm.deleteBooking(bookingID));
		assertNull(cm.getBooking(bookingID));
		assertNull(cm.getBooking(fakeID));
		
		// test getting booking when cart is not set yet
		cm.setCurrentCart(null);
		assertNull(cm.getBooking(bookingID));
		assertFalse(cm.deleteBooking(bookingID));
	}

}
