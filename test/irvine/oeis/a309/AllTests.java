package irvine.oeis.a309;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A309059Test.class);
    suite.addTestSuite(A309076Test.class);
    suite.addTestSuite(A309166Test.class);
    suite.addTestSuite(A309279Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}