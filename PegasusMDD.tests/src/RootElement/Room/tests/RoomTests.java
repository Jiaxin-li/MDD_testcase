/**
 */
package RootElement.Room.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Room</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoomTests extends TestSuite {

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
		TestSuite suite = new RoomTests("Room Tests");
		suite.addTestSuite(RoomManagementTest.class);
		suite.addTestSuite(RoomTypeManagmentTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTests(String name) {
		super(name);
	}

} //RoomTests
