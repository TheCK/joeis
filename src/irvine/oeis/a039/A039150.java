package irvine.oeis.a039;
// Generated by gen_seq4.pl basdig2 10  6 7 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A039150 Numbers whose base-10 representation has the same number of 6's and 7's.
 * @author Georg Fischer
 */
public class A039150 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A039150() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    final int count1 =  getDigitCount(mK, 10, 6);
    return  count1 == getDigitCount(mK, 10, 7);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
