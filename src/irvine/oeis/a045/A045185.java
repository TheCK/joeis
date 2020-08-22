package irvine.oeis.a045;
// Generated by gen_seq4.pl basdig4 5 0 2 3 1 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A045185 Numbers n with property that in base 5 representation the numbers of 0's and 2's are 3 and 1, respectively.
 * @author Georg Fischer
 */
public class A045185 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A045185() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 5, 0) == 3 
        && getDigitCount(mK, 5, 2) == 1;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }

}
