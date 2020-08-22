package irvine.oeis.a045;
// Generated by gen_seq4.pl basdig4 3 0 2 2 4 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A045003 Numbers n with property that in base 3 representation the numbers of 0's and 2's are 2 and 4, respectively.
 * @author Georg Fischer
 */
public class A045003 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A045003() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 3, 0) == 2 
        && getDigitCount(mK, 3, 2) == 4;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }

}
