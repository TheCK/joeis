package irvine.oeis.a044;
// Generated by gen_seq4.pl basdig4 3 0 1 4 3 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A044988 Numbers n with property that in base 3 representation the numbers of 0's and 1's are 4 and 3, respectively.
 * @author Georg Fischer
 */
public class A044988 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A044988() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 3, 0) == 4 
        && getDigitCount(mK, 3, 1) == 3;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }

}
