package irvine.oeis.a301;
// Generated by gen_seq4.pl genetfg at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;
import irvine.oeis.a002.A002131;


/**
 * A301798 Expansion of Product_{k&gt;=1} (1 + x^k)^A002131(k).
 * G.f.: <code>Product_{k&gt;=1} ((1+x^k)^A002131(k))</code>
 * @author Georg Fischer
 */
public class A301798 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A301798() {
    super(0, 1);
    mSeqF = new A002131();
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
