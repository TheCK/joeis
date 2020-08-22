package irvine.oeis.a039;
// Generated by gen_seq4.pl basdig2 12 count1 != 0 && 3 4 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A039523 Numbers n such that representation in base 12 has same nonzero number of 3's and 4's.
 * @author Georg Fischer
 */
public class A039523 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A039523() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    final int count1 =  getDigitCount(mK, 12, 3);
    return count1 != 0 && count1 == getDigitCount(mK, 12, 4);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
