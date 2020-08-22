package irvine.oeis.a043;
// Generated by gen_seq4.pl basrunmod 2 3 6 at 2019-07-04 11:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043736 Numbers n such that number of runs in the base 2 representation of n is congruent to 3 mod 6.
 * @author Georg Fischer
 */
public class A043736 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043736() {
    super(1);
    // mK = ensureWidth(6, 3);
  }

  @Override
  protected boolean isOk() {
    return getRunCount(mK, 2) % 6 == 3;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
