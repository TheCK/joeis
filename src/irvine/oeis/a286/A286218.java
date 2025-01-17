package irvine.oeis.a286;
// Generated by gen_seq4.pl geneth at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;
import irvine.oeis.a026.A026424;


/**
 * A286218 Number of partitions of n into parts with an odd number of prime divisors (counted with multiplicity).
 * G.f.: <code>Product_{k&gt;=1} (1/(1-x^A026424(k)))</code>
 * @author Georg Fischer
 */
public class A286218 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A286218() {
    super(0, 1);
    mSeqH = new A026424();
    mNextH = advanceH(mKh);
  }

  @Override
  protected Z advanceH(final long k) {
    return mSeqH.next();
  }

}
