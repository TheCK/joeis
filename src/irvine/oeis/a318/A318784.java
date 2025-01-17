package irvine.oeis.a318;
// Generated by gen_seq4.pl genetf at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;
import irvine.oeis.a000.A000203;


/**
 * A318784 Expansion of Product_{k&gt;=1} 1/(1 - x^k)^(sigma_1(k)-k), where sigma_1(k) = sum of divisors of k (A000203).
 * G.f.: <code>Product_{k&gt;=1} (1/(1-x^k)^(A000203(k)-k))</code>
 * @author Georg Fischer
 */
public class A318784 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A318784() {
    super(0, 1);
    mSeqF = new A000203();
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{mSeqF.next().subtract(k)};
  }

}
