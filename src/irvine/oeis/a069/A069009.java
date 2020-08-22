package irvine.oeis.a069;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A069009 Let M denote the 6 X 6 matrix with rows / 1,1,1,1,1,1 / 1,1,1,1,1,0 / 1,1,1,1,0,0 / 1,1,1,0,0,0 / 1,1,0,0,0,0 / 1,0,0,0,0,0 / and A(n) the vector (x(n),y(n),z(n),t(n),u(n),v(n)) = M^n*A where A is the vector (1,1,1,1,1,1); then a(n) = t(n).
 * @author Georg Fischer
 */
public class A069009 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A069009() {
    super(0, new long[] {1},
      new long[] {1, -3, -6, 4, 5, -1, -1});
  }
}
