package irvine.oeis.a045;
// Generated by gen_seq4.pl basdig4 5 3 4 3 2 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A045306 Numbers n with property that in base 5 representation the numbers of 3's and 4's are 3 and 2, respectively.
 * @author Georg Fischer
 */
public class A045306 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A045306() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 5, 3) == 3 
        && getDigitCount(mK, 5, 4) == 2;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }

}
