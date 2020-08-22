package irvine.oeis.a001;

/**
 * A001306 Number of ways of making change for n cents using coins of 1, 5, 10, 20, 50, 100 cents.
 * @author Sean A. Irvine
 */
public class A001306 extends A001312 {

  @Override
  protected int[] coins() {
    return new int[] {1, 5, 10, 20, 50, 100};
  }
}
