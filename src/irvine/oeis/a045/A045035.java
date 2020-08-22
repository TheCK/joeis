package irvine.oeis.a045;
// Generated by gen_seq4.pl basdig4 4 0 1 4 2 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A045035 Numbers n with property that in base 4 representation the numbers of 0's and 1's are 4 and 2, respectively.
 * @author Georg Fischer
 */
public class A045035 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A045035() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 4, 0) == 4 
        && getDigitCount(mK, 4, 1) == 2;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }

}
