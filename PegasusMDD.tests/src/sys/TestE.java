package sys;

import RootElement.Account.AccountFactory;
import RootElement.Account.GuestAccountMangement;
import RootElement.Booking.Booking;
import RootElement.Booking.BookingFactory;
import RootElement.Booking.Cart;
import RootElement.Booking.CartManagement;
import RootElement.CheckIO.CheckIO;
import RootElement.CheckIO.CheckIOFactory;
import RootElement.Room.RoomFactory;
import RootElement.Room.RoomManagement;
import RootElement.Room.RoomTypeManagment;

public class TestE {
	public static CartManagement cm;
	public static Cart cart;
	public static Booking booking;
	public static CheckIO checkIO;
	public static GuestAccountMangement gam;
	public static RoomManagement rm;
	public static RoomTypeManagment rtm;
	
	public TestE(){
		cm = BookingFactory.eINSTANCE.createCartManagement();
		cart = BookingFactory.eINSTANCE.createCart();
		booking = BookingFactory.eINSTANCE.createBooking();
		checkIO = CheckIOFactory.eINSTANCE.createCheckIO();
		gam = AccountFactory.eINSTANCE.createGuestAccountMangement();
		rm = RoomFactory.eINSTANCE.createRoomManagement();
		rtm = RoomFactory.eINSTANCE.createRoomTypeManagment();
		
		cm.setCurrentCart(cart);
	}	
}
