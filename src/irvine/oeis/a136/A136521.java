package irvine.oeis.a136;
// Generated by gen_seq4.pl triconst at 2021-10-17 19:37

import irvine.oeis.a036.A036453;
import irvine.oeis.triangle.WrappedConstantTriangle;

/**
 * A136521 Triangle read by rows: (1, 2, 2, 2, ...) on the main diagonal and the rest zeros.
 * @author Georg Fischer
 */
public class A136521 extends WrappedConstantTriangle {

  /** Construct the sequence. */
  public A136521() {
    super("0", new A036453());
    setPlus("0");
  }
}
