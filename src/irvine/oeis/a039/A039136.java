package irvine.oeis.a039;
// Generated by gen_seq4.pl basdig2 10  3 5 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A039136 Numbers n such that representation in base 10 has same number of 3's and 5's.
 * @author Georg Fischer
 */
public class A039136 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A039136() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    final int count1 =  getDigitCount(mK, 10, 3);
    return  count1 == getDigitCount(mK, 10, 5);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
