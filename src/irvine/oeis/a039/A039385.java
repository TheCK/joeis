package irvine.oeis.a039;
// Generated by gen_seq4.pl basdig2 9 count1 != 0 && 4 7 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A039385 Numbers n such that representation in base 9 has same nonzero number of 4's and 7's.
 * @author Georg Fischer
 */
public class A039385 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A039385() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    final int count1 =  getDigitCount(mK, 9, 4);
    return count1 != 0 && count1 == getDigitCount(mK, 9, 7);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
