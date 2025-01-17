package irvine.oeis.a043;
// Generated by gen_seq4.pl basdig1 1 10 6 1 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043513 Numbers having one 6 in base 10.
 * @author Georg Fischer
 */
public class A043513 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043513() {
    super(1, 0); //
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 10, 6) == 1;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
