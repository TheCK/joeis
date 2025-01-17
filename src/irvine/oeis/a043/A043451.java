package irvine.oeis.a043;
// Generated by gen_seq4.pl basdig1 1 8 7 3 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043451 Numbers having three 7's in base 8.
 * @author Georg Fischer
 */
public class A043451 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043451() {
    super(1, 0); //
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 8, 7) == 3;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
