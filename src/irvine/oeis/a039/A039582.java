package irvine.oeis.a039;
// Generated by gen_seq4.pl basdig3 6  0 4 5 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A039582 Numbers n such that representation in base 6 has same number of 0's, 4's and 5's.
 * @author Georg Fischer
 */
public class A039582 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A039582() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    final int count1 =  getDigitCount(mK, 6, 0);
    final int count2 =  getDigitCount(mK, 6, 4);
    return  
        count1 == getDigitCount(mK, 6, 5)
        && count1 == count2;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }

}
