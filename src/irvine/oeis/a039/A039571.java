package irvine.oeis.a039;
// Generated by gen_seq4.pl basdig3 5  1 3 4 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A039571 Numbers n such that representation in base 5 has same number of 1's, 3's and 4's.
 * @author Georg Fischer
 */
public class A039571 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A039571() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    final int count1 =  getDigitCount(mK, 5, 1);
    final int count2 =  getDigitCount(mK, 5, 3);
    return  
        count1 == getDigitCount(mK, 5, 4)
        && count1 == count2;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }

}
