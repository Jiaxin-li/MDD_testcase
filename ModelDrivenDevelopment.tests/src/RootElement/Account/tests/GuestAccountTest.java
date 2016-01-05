/**
 */
package RootElement.Account.tests;

import RootElement.Account.AccountFactory;
import RootElement.Account.GuestAccount;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Guest Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link RootElement.Account.GuestAccount#getUserInfo() <em>Get User Info</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class GuestAccountTest extends UserAccountsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GuestAccountTest.class);
	}

	/**
	 * Constructs a new Guest Account test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuestAccountTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Guest Account test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GuestAccount getFixture() {
		return (GuestAccount)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AccountFactory.eINSTANCE.createGuestAccount());
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
	 * Tests the '{@link RootElement.Account.GuestAccount#getUserInfo() <em>Get User Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Account.GuestAccount#getUserInfo()
	 * @generated
	 */
	public void testGetUserInfo() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //GuestAccountTest
