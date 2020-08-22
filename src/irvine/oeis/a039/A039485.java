package irvine.oeis.a039;
// Generated by gen_seq4.pl basdig2 11 count1 != 0 && 6 9 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A039485 Numbers n such that representation in base 11 has same nonzero number of 6's and 9's.
 * @author Georg Fischer
 */
public class A039485 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A039485() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    final int count1 =  getDigitCount(mK, 11, 6);
    return count1 != 0 && count1 == getDigitCount(mK, 11, 9);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
