package irvine.oeis.a045;
// Generated by gen_seq4.pl basdig4 4 1 3 2 1 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A045120 Numbers n with property that in base 4 representation the numbers of 1's and 3's are 2 and 1, respectively.
 * @author Georg Fischer
 */
public class A045120 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A045120() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 4, 1) == 2 
        && getDigitCount(mK, 4, 3) == 1;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }

}
