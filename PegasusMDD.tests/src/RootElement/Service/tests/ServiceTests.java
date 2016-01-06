/**
 */
package RootElement.Service.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Service</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceTests extends TestSuite {

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
		TestSuite suite = new ServiceTests("Service Tests");
		suite.addTestSuite(ServiceManagementTest.class);
		suite.addTestSuite(ServiceTypeManagmentTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTests(String name) {
		super(name);
	}

} //ServiceTests
