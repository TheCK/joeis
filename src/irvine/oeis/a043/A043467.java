package irvine.oeis.a043;
// Generated by gen_seq4.pl basdig1 1 9 3 3 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043467 Numbers having three 3's in base 9.
 * @author Georg Fischer
 */
public class A043467 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043467() {
    super(1, 0); //
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 9, 3) == 3;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
