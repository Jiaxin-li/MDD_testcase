/**
 */
package RootElement.Account.tests;

import RootElement.Account.AccessControl;
import RootElement.Account.AccountFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Access Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link RootElement.Account.AccessControl#authenticate(java.lang.String, java.lang.String) <em>Authenticate</em>}</li>
 *   <li>{@link RootElement.Account.AccessControl#authorize(int) <em>Authorize</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AccessControlTest extends TestCase {

	/**
	 * The fixture for this Access Control test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessControl fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AccessControlTest.class);
	}

	/**
	 * Constructs a new Access Control test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessControlTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Access Control test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AccessControl fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Access Control test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessControl getFixture() {
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
		setFixture(AccountFactory.eINSTANCE.createAccessControl());
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
	 * Tests the '{@link RootElement.Account.AccessControl#authenticate(java.lang.String, java.lang.String) <em>Authenticate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Account.AccessControl#authenticate(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testAuthenticate__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link RootElement.Account.AccessControl#authorize(int) <em>Authorize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Account.AccessControl#authorize(int)
	 * @generated
	 */
	public void testAuthorize__int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //AccessControlTest
