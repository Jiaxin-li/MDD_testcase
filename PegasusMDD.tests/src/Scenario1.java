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
		//assertTrue(rtm.addRoomType("single", 50, 1));
		EList<RoomType> roomTypes = rtm.getRoomtypes();
		RoomType roomType = RoomFactory.eINSTANCE.createRoomType();
		roomType.setNumberOfBeds(1);
		roomType.setPrice(50);
		roomType.setRoomTypeID(0);
		roomType.setRoomTypeName("single");
		roomTypes.add(roomType); 
		
		AvailablityMap av = ScheduleFactory.eINSTANCE.createAvailablityMap(); 
		av.setAvailable(100);
		Calendar calendar = Calendar.getInstance();
		calendar.set(2016, 1, 8);
		Date ddl = calendar.getTime(); 
		av.setDate(ddl);
		av.setRoomType(roomType);
		scdl.getSchedule().add(av);
		
		Room room = RoomFactory.eINSTANCE.createRoom();
		room.setAvailable(true);
		room.setFloorNumber(1);
		room.setRoomNumber(1);
		room.setRoomType(roomType);
		
		rm.addRoom(room);
		
		calendar.set(2016, 1, 7);
		Date checkIn = calendar.getTime();
		
		calendar.set(2016, 1, 9);
		Date checkOut = calendar.getTime();
		
		assertTrue(cm.addBooking(0, checkIn, checkOut, 1));
		
		assertNotNull(cm.getBooking(0));
		
		assertTrue(check.CheckIn(0));
		
		assertTrue(check.CheckOut(0));
	}

}
