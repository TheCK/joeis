package irvine.oeis.a168;
// Generated by gen_seq4.pl triconst at 2021-10-31 22:00

import irvine.oeis.a000.A000108;
import irvine.oeis.triangle.WrappedConstantTriangle;

/**
 * A168256 Triangle read by rows: Catalan number C(n) repeated n+1 times.
 * @author Georg Fischer
 */
public class A168256 extends WrappedConstantTriangle {

  /** Construct the sequence. */
  public A168256() {
    super(new A000108(), new A000108());
    setPlus(new A000108());
    skipPlus(2);
  }
}
