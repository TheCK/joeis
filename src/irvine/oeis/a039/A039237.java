package irvine.oeis.a039;
// Generated by gen_seq4.pl basdig2 12  2 10 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A039237 Numbers n such that representation in base 12 has same number of 2's and 10's.
 * @author Georg Fischer
 */
public class A039237 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A039237() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    final int count1 =  getDigitCount(mK, 12, 2);
    return  count1 == getDigitCount(mK, 12, 10);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
