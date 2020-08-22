package irvine.oeis.a043;
// Generated by gen_seq4.pl basdig1 1 7 1 3 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043399 Numbers n such that number of 1's in base 7 is 3.
 * @author Georg Fischer
 */
public class A043399 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043399() {
    super(1, 0); //
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 7, 1) == 3;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
