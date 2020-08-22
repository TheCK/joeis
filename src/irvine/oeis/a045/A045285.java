package irvine.oeis.a045;
// Generated by gen_seq4.pl basdig4 5 2 4 2 0 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A045285 Numbers n with property that in base 5 representation the numbers of 2's and 4's are 2 and 0, respectively.
 * @author Georg Fischer
 */
public class A045285 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A045285() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 5, 2) == 2 
        && getDigitCount(mK, 5, 4) == 0;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }

}
