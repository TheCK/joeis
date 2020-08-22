package irvine.oeis.a039;
// Generated by gen_seq4.pl basdig2 6  3 4 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A039027 Numbers whose representation in base 6 has the same number of 3's and 4's.
 * @author Georg Fischer
 */
public class A039027 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A039027() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    final int count1 =  getDigitCount(mK, 6, 3);
    return  count1 == getDigitCount(mK, 6, 4);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
