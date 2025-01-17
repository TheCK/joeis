package irvine.oeis.a039;
// Generated by gen_seq4.pl basdig2 8 count1 != 0 && 5 7 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A039355 Numbers whose base-8 representation has the same nonzero number of 5's and 7's.
 * @author Georg Fischer
 */
public class A039355 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A039355() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    final int count1 =  getDigitCount(mK, 8, 5);
    return count1 != 0 && count1 == getDigitCount(mK, 8, 7);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
