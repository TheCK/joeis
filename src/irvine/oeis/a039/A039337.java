package irvine.oeis.a039;
// Generated by gen_seq4.pl basdig2 8 count1 != 0 && 1 3 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A039337 Numbers n such that representation in base 8 has same nonzero number of 1's and 3's.
 * @author Georg Fischer
 */
public class A039337 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A039337() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    final int count1 =  getDigitCount(mK, 8, 1);
    return count1 != 0 && count1 == getDigitCount(mK, 8, 3);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
