package irvine.oeis.a286;
// Generated by gen_seq4.pl genet at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;
import irvine.oeis.a001.A001694;


/**
 * A286320 Number of partitions of n into distinct powerful parts (A001694).
 * G.f.: <code>Product_{k&gt;=1} ((1+x^A001694(k)))</code>
 * @author Georg Fischer
 */
public class A286320 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A286320() {
    super(0, 1);
    mSeqH = new A001694();
    mNextH = advanceH(mKh);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{Z.NEG_ONE};
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.NEG_ONE;
  }

  @Override
  protected Z advanceH(final long k) {
    return mSeqH.next();
  }

}
