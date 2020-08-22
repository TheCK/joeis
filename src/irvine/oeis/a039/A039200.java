package irvine.oeis.a039;
// Generated by gen_seq4.pl basdig2 11  6 7 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A039200 Numbers n such that representation in base 11 has same number of 6's and 7's.
 * @author Georg Fischer
 */
public class A039200 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A039200() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    final int count1 =  getDigitCount(mK, 11, 6);
    return  count1 == getDigitCount(mK, 11, 7);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
