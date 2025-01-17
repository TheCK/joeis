package irvine.oeis.a039;
// Generated by gen_seq4.pl basdig2 12  10 11 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A039274 Numbers whose base-12 representation has the same number of 10's and 11's.
 * @author Georg Fischer
 */
public class A039274 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A039274() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    final int count1 =  getDigitCount(mK, 12, 10);
    return  count1 == getDigitCount(mK, 12, 11);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
