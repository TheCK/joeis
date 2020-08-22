package irvine.oeis.a045;
// Generated by gen_seq4.pl basdig4 4 1 2 0 2 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A045087 Numbers n with property that in base 4 representation the numbers of 1's and 2's are 0 and 2, respectively.
 * @author Georg Fischer
 */
public class A045087 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A045087() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 4, 1) == 0 
        && getDigitCount(mK, 4, 2) == 2;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }

}
