package irvine.oeis.a039;
// Generated by gen_seq4.pl basdig2 5 count1 != 0 && 1 4 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A039289 Numbers whose base-5 representation has the same nonzero number of 1's and 4's.
 * @author Georg Fischer
 */
public class A039289 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A039289() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    final int count1 =  getDigitCount(mK, 5, 1);
    return count1 != 0 && count1 == getDigitCount(mK, 5, 4);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
