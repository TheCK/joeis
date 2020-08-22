package irvine.oeis.a044;
// Generated by gen_seq4.pl basdig4 3 0 1 2 4 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A044979 Numbers n with property that in base 3 representation the numbers of 0's and 1's are 2 and 4, respectively.
 * @author Georg Fischer
 */
public class A044979 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A044979() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 3, 0) == 2 
        && getDigitCount(mK, 3, 1) == 4;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }

}
