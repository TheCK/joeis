package irvine.oeis.a039;
// Generated by gen_seq4.pl basdig2 12  5 8 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A039256 Numbers n such that representation in base 12 has same number of 5's and 8's.
 * @author Georg Fischer
 */
public class A039256 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A039256() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    final int count1 =  getDigitCount(mK, 12, 5);
    return  count1 == getDigitCount(mK, 12, 8);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
