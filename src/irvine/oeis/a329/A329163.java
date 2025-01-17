package irvine.oeis.a329;
// Generated by gen_seq4.pl genetfg at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;
import irvine.oeis.a032.A032198;


/**
 * A329163 Expansion of Product_{k&gt;=1} 1 / (1 - Sum_{j&gt;=1} j * x^(j*(2*k - 1))).
 * G.f.: <code>Product_{k&gt;=1} ((1+x^k)^A032198(k))</code>
 * @author Georg Fischer
 */
public class A329163 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A329163() {
    super(0, 1);
    mSeqF = new A032198();
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{mSeqF.next().negate()};
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.NEG_ONE;
  }

}
