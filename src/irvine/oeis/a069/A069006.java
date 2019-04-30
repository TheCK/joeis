package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069006 Let M denote the 5 X 5 matrix with rows <code>/1,1,1,1,1/1,1,1,1,0/1,1,1,0,0/1,1,0,0,0/1,0,0,0,0/</code> and <code>A(n) =</code> vector <code>(x(n),y(n),z(n),t(n),u(n)) =</code> M^n*A where A is the vector <code>(1,1,1,1,1)</code>; then <code>a(n) = t(n)</code>.
 * @author Sean A. Irvine
 */
public class A069006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069006() {
    super(new long[] {1, -1, -4, 3, 3}, new long[] {1, 2, 9, 29, 105});
  }
}
