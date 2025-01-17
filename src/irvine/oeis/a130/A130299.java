package irvine.oeis.a130;
// Generated by gen_seq4.pl triconst at 2021-10-17 19:37

import irvine.oeis.a000.A000027;
import irvine.oeis.a005.A005408;
import irvine.oeis.a030.A030544;
import irvine.oeis.triangle.WrappedConstantTriangle;

/**
 * A130299 A130296 * A051340.
 * @author Georg Fischer
 */
public class A130299 extends WrappedConstantTriangle {

  /** Construct the sequence. */
  public A130299() {
    super(new A005408(), new A000027());
    setPlus(new A030544());
  }
}
