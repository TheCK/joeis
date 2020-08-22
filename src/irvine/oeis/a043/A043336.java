package irvine.oeis.a043;
// Generated by gen_seq4.pl basdig1 1 4 0 4 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043336 Numbers n such that number of 0's in base 4 is 4.
 * @author Georg Fischer
 */
public class A043336 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043336() {
    super(1, 0); //
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 4, 0) == 4;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
