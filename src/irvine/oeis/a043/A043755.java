package irvine.oeis.a043;
// Generated by gen_seq4.pl basrunmod 2 1 9 at 2019-07-04 11:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043755 Numbers n such that number of runs in the base 2 representation of n is congruent to 1 mod 9.
 * @author Georg Fischer
 */
public class A043755 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043755() {
    super(1);
    // mK = ensureWidth(9, 1);
  }

  @Override
  protected boolean isOk() {
    return getRunCount(mK, 2) % 9 == 1;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
