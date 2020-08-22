package irvine.oeis.a039;
// Generated by gen_seq4.pl basdig2 10 count1 != 0 && 4 8 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A039426 Numbers n such that representation in base 10 has same nonzero number of 4's and 8's.
 * @author Georg Fischer
 */
public class A039426 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A039426() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    final int count1 =  getDigitCount(mK, 10, 4);
    return count1 != 0 && count1 == getDigitCount(mK, 10, 8);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
