package irvine.oeis.a043;
// Generated by gen_seq4.pl basdig1 1 7 0 4 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043396 Numbers n such that number of 0's in base 7 is 4.
 * @author Georg Fischer
 */
public class A043396 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043396() {
    super(1, 0); //
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 7, 0) == 4;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
