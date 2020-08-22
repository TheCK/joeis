package irvine.oeis.a043;
// Generated by gen_seq4.pl basrunmod 2 8 10 at 2019-07-04 11:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043771 Number of runs in the base 2 representation of n is congruent to 8 mod 10.
 * @author Georg Fischer
 */
public class A043771 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043771() {
    super(1);
    // mK = ensureWidth(10, 8);
  }

  @Override
  protected boolean isOk() {
    return getRunCount(mK, 2) % 10 == 8;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
