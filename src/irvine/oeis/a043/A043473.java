package irvine.oeis.a043;
// Generated by gen_seq4.pl basdig1 1 9 5 1 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043473 Numbers n such that number of 5's in base 9 is 1.
 * @author Georg Fischer
 */
public class A043473 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043473() {
    super(1, 0); //
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 9, 5) == 1;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
