package irvine.oeis.a043;
// Generated by gen_seq4.pl basdig1 1 3 0 2 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043322 Numbers n such that number of 0's in base 3 is 2.
 * @author Georg Fischer
 */
public class A043322 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043322() {
    super(1, 0); //
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 3, 0) == 2;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
