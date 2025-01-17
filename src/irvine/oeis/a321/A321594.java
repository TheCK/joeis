package irvine.oeis.a321;
// Generated by gen_seq4.pl genetfg at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;
import irvine.oeis.a001.A001055;


/**
 * A321594 Expansion of Product_{k&gt;0} (1 - A001055(k)*x^k).
 * G.f.: <code>Product_{k&gt;=1} ((1-A001055(k)*x^k))</code>
 * @author Georg Fischer
 */
public class A321594 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A321594() {
    super(0, 1);
    mSeqG = new A001055();
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
