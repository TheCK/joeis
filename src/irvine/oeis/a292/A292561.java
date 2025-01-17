package irvine.oeis.a292;
// Generated by gen_seq4.pl genetfg at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;
import irvine.oeis.a008.A008966;


/**
 * A292561 Expansion of Product_{k&gt;=1} (1 - mu(k)^2*x^k), where mu() is the Moebius function (A008683).
 * G.f.: <code>Product_{k&gt;=1} ((1-A008966(k)*x^k))</code>
 * @author Georg Fischer
 */
public class A292561 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A292561() {
    super(0, 1);
    mSeqG = new A008966();
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{Z.NEG_ONE};
  }

  @Override
  protected Z advanceG(final long k) {
    return mSeqG.next();
  }

}
