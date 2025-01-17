package irvine.oeis.a131;
// Generated by gen_seq4.pl triconst at 2021-10-17 19:37

import irvine.oeis.a000.A000045;
import irvine.oeis.a020.A020695;
import irvine.oeis.triangle.WrappedConstantTriangle;

/**
 * A131410 A127647 * A000012.
 * @author Georg Fischer
 */
public class A131410 extends WrappedConstantTriangle {

  /** Construct the sequence. */
  public A131410() {
    super(new A000045(), new A000045());
    setPlus(new A020695());
    skipLeft(1);
    skipRight(1);
  }
}
