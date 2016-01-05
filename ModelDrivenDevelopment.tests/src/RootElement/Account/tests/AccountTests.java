/**
 */
package RootElement.Account.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Account</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class AccountTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new AccountTests("Account Tests");
		suite.addTestSuite(StaffAccountTest.class);
		suite.addTestSuite(AccessControlTest.class);
		suite.addTestSuite(StaffAccountManagementTest.class);
		suite.addTestSuite(GuestAccountMangementTest.class);
		suite.addTestSuite(GuestAccountTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountTests(String name) {
		super(name);
	}

} //AccountTests
