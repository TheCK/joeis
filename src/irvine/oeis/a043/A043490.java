package irvine.oeis.a043;
// Generated by gen_seq4.pl basdig1 1 10 0 2 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043490 Numbers k such that number of 0's in base 10 is 2.
 * @author Georg Fischer
 */
public class A043490 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043490() {
    super(1, 0); //
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 10, 0) == 2;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
