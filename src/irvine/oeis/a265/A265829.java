package irvine.oeis.a265;
// Generated by gen_seq4.pl genetgh at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;


/**
 * A265829 Expansion of Product_{k&gt;=1} 1/(1 - (4*k-2)*x^(4*k-2)).
 * G.f.: <code>Product_{k&gt;=1} (1/(1-(4*k-2)*x^(4*k-2)))</code>
 * @author Georg Fischer
 */
public class A265829 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A265829() {
    super(0, 1);
    mNextH = advanceH(mKh);
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.valueOf(4 * mKh - 2);
  }

  @Override
  protected Z advanceH(final long k) {
    return Z.valueOf(4 * k - 2);
  }

}
