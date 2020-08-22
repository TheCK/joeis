package irvine.oeis.a045;
// Generated by gen_seq4.pl basdig4 5 2 4 2 3 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A045288 Numbers n with property that in base 5 representation the numbers of 2's and 4's are 2 and 3, respectively.
 * @author Georg Fischer
 */
public class A045288 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A045288() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 5, 2) == 2 
        && getDigitCount(mK, 5, 4) == 3;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }

}
