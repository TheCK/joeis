package irvine.oeis.a045;
// Generated by gen_seq4.pl basdig4 4 0 3 3 3 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A045079 Numbers n with property that in base 4 representation the numbers of 0's and 3's are 3 and 3, respectively.
 * @author Georg Fischer
 */
public class A045079 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A045079() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 4, 0) == 3 
        && getDigitCount(mK, 4, 3) == 3;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }

}
