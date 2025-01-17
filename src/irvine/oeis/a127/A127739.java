package irvine.oeis.a127;
// Generated by gen_seq4.pl triconst at 2021-10-31 22:00

import irvine.oeis.a000.A000217;
import irvine.oeis.triangle.WrappedConstantTriangle;

/**
 * A127739 Triangle read by rows, in which row n contains the triangular number T(n) = A000217(n) repeated n times; smallest triangular number greater than or equal to n.
 * @author Georg Fischer
 */
public class A127739 extends WrappedConstantTriangle {

  /** Construct the sequence. */
  public A127739() {
    super(new A000217(), new A000217());
    setPlus(new A000217());
    skipLeft(1);
    skipRight(1);
    skipPlus(3);
  }
}
