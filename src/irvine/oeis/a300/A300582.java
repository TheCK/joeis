package irvine.oeis.a300;
// Generated by gen_seq4.pl genetm/genetfg at 2022-02-20 21:45

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;

/**
 * A300582 Expansion of Product_{k&gt;=1} 1 / (1 - 3*2^k*x^k)).
 * G.f.: <code>Product_{k&gt;=1} (1/(1-3*2^k*x^k)))</code>
 * @author Georg Fischer
 */
public class A300582 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A300582() {
    super(0, 1);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[] {Z.ONE};
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.ONE.shiftLeft((int) k).multiply(3);
  }

}
