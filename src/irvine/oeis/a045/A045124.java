package irvine.oeis.a045;
// Generated by gen_seq4.pl basdig4 4 1 3 3 0 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A045124 Numbers n with property that in base 4 representation the numbers of 1's and 3's are 3 and 0, respectively.
 * @author Georg Fischer
 */
public class A045124 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A045124() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 4, 1) == 3 
        && getDigitCount(mK, 4, 3) == 0;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }

}
