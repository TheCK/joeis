package irvine.oeis.a039;
// Generated by gen_seq4.pl basdig2 11 count1 != 0 && 6 8 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A039484 Numbers whose base-11 representation has the same nonzero number of 6's and 8's.
 * @author Georg Fischer
 */
public class A039484 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A039484() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    final int count1 =  getDigitCount(mK, 11, 6);
    return count1 != 0 && count1 == getDigitCount(mK, 11, 8);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
