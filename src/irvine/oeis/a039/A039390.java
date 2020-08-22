package irvine.oeis.a039;
// Generated by gen_seq4.pl basdig2 9 count1 != 0 && 6 7 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A039390 Numbers n such that representation in base 9 has same nonzero number of 6's and 7's.
 * @author Georg Fischer
 */
public class A039390 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A039390() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    final int count1 =  getDigitCount(mK, 9, 6);
    return count1 != 0 && count1 == getDigitCount(mK, 9, 7);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
