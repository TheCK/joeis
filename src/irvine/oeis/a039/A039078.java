package irvine.oeis.a039;
// Generated by gen_seq4.pl basdig2 9  0 2 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A039078 Numbers n such that representation in base 9 has same number of 0's and 2's.
 * @author Georg Fischer
 */
public class A039078 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A039078() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    final int count1 =  getDigitCount(mK, 9, 0);
    return  count1 == getDigitCount(mK, 9, 2);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
