package irvine.oeis.a170;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 *
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A170777Test.class);
    suite.addTestSuite(A170786Test.class);
    suite.addTestSuite(A170793Test.class);
    suite.addTestSuite(A170831Test.class);
    suite.addTestSuite(A170832Test.class);
    suite.addTestSuite(A170833Test.class);
    suite.addTestSuite(A170834Test.class);
    suite.addTestSuite(A170896Test.class);
    suite.addTestSuite(A170931Test.class);
    suite.addTestSuite(A170933Test.class);
    suite.addTestSuite(A170934Test.class);
    suite.addTestSuite(A170935Test.class);
    suite.addTestSuite(A170938Test.class);
    suite.addTestSuite(A170939Test.class);
    suite.addTestSuite(A170940Test.class);
    suite.addTestSuite(A170955Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
