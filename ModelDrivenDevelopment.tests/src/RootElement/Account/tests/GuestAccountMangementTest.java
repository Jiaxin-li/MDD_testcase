/**
 */
package RootElement.Account.tests;

import RootElement.Account.AccountFactory;
import RootElement.Account.GuestAccountMangement;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Guest Account Mangement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link RootElement.Account.IGuest#getGuest(int) <em>Get Guest</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class GuestAccountMangementTest extends TestCase {

	/**
	 * The fixture for this Guest Account Mangement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuestAccountMangement fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GuestAccountMangementTest.class);
	}

	/**
	 * Constructs a new Guest Account Mangement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuestAccountMangementTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Guest Account Mangement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(GuestAccountMangement fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Guest Account Mangement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuestAccountMangement getFixture() {
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
		setFixture(AccountFactory.eINSTANCE.createGuestAccountMangement());
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
	 * Tests the '{@link RootElement.Account.IGuest#getGuest(int) <em>Get Guest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Account.IGuest#getGuest(int)
	 * @generated
	 */
	public void testGetGuest__int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //GuestAccountMangementTest
