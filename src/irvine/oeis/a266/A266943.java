package irvine.oeis.a266;
// Generated by gen_seq4.pl genetm/genetfg at 2022-02-20 21:45

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;

/**
 * A266943 Expansion of Product_{k&gt;=1} 1 / (1 - 2*x^k))^2.
 * G.f.: <code>Product_{k&gt;=1} (1/(1-2*x^k))^2)</code>
 * @author Georg Fischer
 */
public class A266943 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A266943() {
    super(0, 1);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[] {Z.TWO};
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.TWO;
  }

}
