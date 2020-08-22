package irvine.oeis.a039;
// Generated by gen_seq4.pl basdig2 9 count1 != 0 && 3 6 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A039380 Numbers n such that representation in base 9 has same nonzero number of 3's and 6's.
 * @author Georg Fischer
 */
public class A039380 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A039380() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    final int count1 =  getDigitCount(mK, 9, 3);
    return count1 != 0 && count1 == getDigitCount(mK, 9, 6);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
