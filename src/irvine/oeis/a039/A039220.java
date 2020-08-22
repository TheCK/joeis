package irvine.oeis.a039;
// Generated by gen_seq4.pl basdig2 12  1 2 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A039220 Numbers n such that representation in base 12 has the same number of 1's and 2's.
 * @author Georg Fischer
 */
public class A039220 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A039220() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    final int count1 =  getDigitCount(mK, 12, 1);
    return  count1 == getDigitCount(mK, 12, 2);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
