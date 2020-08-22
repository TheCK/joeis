package irvine.oeis.a043;
// Generated by gen_seq4.pl basdig1 1 10 5 3 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043511 Numbers such that the number of 5's in their decimal representation is 3.
 * @author Georg Fischer
 */
public class A043511 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043511() {
    super(1, 0); //
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 10, 5) == 3;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
