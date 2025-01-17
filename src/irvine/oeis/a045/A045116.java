package irvine.oeis.a045;
// Generated by gen_seq4.pl basdig4 4 1 3 1 2 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A045116 Numbers n with property that in base 4 representation the numbers of 1's and 3's are 1 and 2, respectively.
 * @author Georg Fischer
 */
public class A045116 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A045116() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 4, 1) == 1 
        && getDigitCount(mK, 4, 3) == 2;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }

}
