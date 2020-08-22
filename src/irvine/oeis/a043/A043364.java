package irvine.oeis.a043;
// Generated by gen_seq4.pl basdig1 1 5 3 4 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043364 Numbers n such that number of 3's in base 5 is 4.
 * @author Georg Fischer
 */
public class A043364 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043364() {
    super(1, 0); //
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 5, 3) == 4;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
