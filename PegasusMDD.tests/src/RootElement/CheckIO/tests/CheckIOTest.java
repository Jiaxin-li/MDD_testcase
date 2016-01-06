/**
 */
package RootElement.CheckIO.tests;

import RootElement.CheckIO.CheckIO;
import RootElement.CheckIO.CheckIOFactory;
import RootElement.Booking.*;
import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Check IO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link RootElement.CheckIO.CheckIO#payOrder(int) <em>Pay Order</em>}</li>
 *   <li>{@link RootElement.CheckIO.CheckIO#generateTotal(int) <em>Generate Total</em>}</li>
 *   <li>{@link RootElement.CheckIO.CheckIO#getPaymentResult(int) <em>Get Payment Result</em>}</li>
 *   <li>{@link RootElement.CheckIO.CheckIO#CheckOut(int) <em>Check Out</em>}</li>
 *   <li>{@link RootElement.CheckIO.CheckIO#CheckIn(int) <em>Check In</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class CheckIOTest extends TestCase {

	/**
	 * The fixture for this Check IO test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckIO fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CheckIOTest.class);
	}

	/**
	 * Constructs a new Check IO test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckIOTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Check IO test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CheckIO fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Check IO test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckIO getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CheckIOFactory.eINSTANCE.createCheckIO());
		Booking booking = sys.TestE.booking;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link RootElement.CheckIO.CheckIO#payOrder(int) <em>Pay Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.CheckIO.CheckIO#payOrder(int)
	 * 
	 */
	public void testPayOrder__int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		assertTrue(fixture.payOrder(0));
	}

	/**
	 * Tests the '{@link RootElement.CheckIO.CheckIO#generateTotal(int) <em>Generate Total</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.CheckIO.CheckIO#generateTotal(int)
	 * @generated
	 */
	public void testGenerateTotal__int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		
		assertEqual(fixture.generateTotal(0)==100);
	}

	/**
	 * Tests the '{@link RootElement.CheckIO.CheckIO#getPaymentResult(int) <em>Get Payment Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.CheckIO.CheckIO#getPaymentResult(int)
	 * @generated
	 */
	public void testGetPaymentResult__int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		//fail();
	}

	/**
	 * Tests the '{@link RootElement.CheckIO.CheckIO#CheckOut(int) <em>Check Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.CheckIO.CheckIO#CheckOut(int)
	 * @generated
	 */
	public void testCheckOut__int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		//fail();
	}

	/**
	 * Tests the '{@link RootElement.CheckIO.CheckIO#CheckIn(int) <em>Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.CheckIO.CheckIO#CheckIn(int)
	 * @generated
	 */
	public void testCheckIn__int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		//fail();
	}

} //CheckIOTest
