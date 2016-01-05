/**
 */
package RootElement.Payment.tests;

import RootElement.Account.tests.AccountTests;

import RootElement.Booking.tests.BookingTests;

import RootElement.CheckIO.tests.CheckIOTests;

import RootElement.Room.tests.RoomTests;

import RootElement.Schedule.tests.ScheduleTests;

import RootElement.Service.tests.ServiceTests;

import RootElement.Task.tests.TaskTests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Codegen</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class CodegenAllTests extends TestSuite {

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
		TestSuite suite = new CodegenAllTests("Codegen Tests");
		suite.addTest(PaymentTests.suite());
		suite.addTest(BookingTests.suite());
		suite.addTest(AccountTests.suite());
		suite.addTest(RoomTests.suite());
		suite.addTest(ServiceTests.suite());
		suite.addTest(TaskTests.suite());
		suite.addTest(CheckIOTests.suite());
		suite.addTest(ScheduleTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodegenAllTests(String name) {
		super(name);
	}

} //CodegenAllTests
