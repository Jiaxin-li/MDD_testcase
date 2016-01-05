/**
 */
package RootElement.CheckIO.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>CheckIO</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class CheckIOTests extends TestSuite {

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
		TestSuite suite = new CheckIOTests("CheckIO Tests");
		suite.addTestSuite(RoomBinderTest.class);
		suite.addTestSuite(CheckIOTest.class);
		suite.addTestSuite(InvoiceTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckIOTests(String name) {
		super(name);
	}

} //CheckIOTests
