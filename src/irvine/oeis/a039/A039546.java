package irvine.oeis.a039;
// Generated by gen_seq4.pl basdig2 12 count1 != 0 && 6 9 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A039546 Numbers n such that representation in base 12 has same nonzero number of 6's and 9's.
 * @author Georg Fischer
 */
public class A039546 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A039546() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    final int count1 =  getDigitCount(mK, 12, 6);
    return count1 != 0 && count1 == getDigitCount(mK, 12, 9);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
