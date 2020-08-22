package irvine.oeis.a039;
// Generated by gen_seq4.pl basdig2 12  1 10 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A039228 Numbers n whose base-12 representation has the same number of 1's and 10's.
 * @author Georg Fischer
 */
public class A039228 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A039228() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    final int count1 =  getDigitCount(mK, 12, 1);
    return  count1 == getDigitCount(mK, 12, 10);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
