package irvine.oeis.a043;
// Generated by gen_seq4.pl basdig1 1 10 8 4 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043524 Numbers such that the number of 8's in their decimal representation is 4.
 * @author Georg Fischer
 */
public class A043524 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043524() {
    super(1, 0); //
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 10, 8) == 4;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
