package irvine.oeis.a039;
// Generated by gen_seq4.pl basdig2 12  6 11 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A039264 Numbers n such that representation in base 12 has same number of 6's and 11's.
 * @author Georg Fischer
 */
public class A039264 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A039264() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    final int count1 =  getDigitCount(mK, 12, 6);
    return  count1 == getDigitCount(mK, 12, 11);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
