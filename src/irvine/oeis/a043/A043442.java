package irvine.oeis.a043;
// Generated by gen_seq4.pl basdig1 1 8 5 2 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043442 Numbers n such that number of 5's in base 8 is 2.
 * @author Georg Fischer
 */
public class A043442 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043442() {
    super(1, 0); //
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 8, 5) == 2;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
