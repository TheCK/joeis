package irvine.oeis.a063;
// Generated by gen_seq4.pl triconst at 2021-10-17 19:37

import irvine.oeis.a000.A000027;
import irvine.oeis.triangle.WrappedConstantTriangle;

/**
 * A063712 Table of bits required for product of n- and k-bit positive numbers read by antidiagonals.
 * @author Georg Fischer
 */
public class A063712 extends WrappedConstantTriangle {

  /** Construct the sequence. */
  public A063712() {
    super(new A000027(), new A000027());
    setPlus(new A000027());
    skipPlus(3);
  }
}
