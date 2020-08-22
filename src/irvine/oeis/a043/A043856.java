package irvine.oeis.a043;
// Generated by gen_seq4.pl basrunmod 4 6 8 at 2019-07-04 11:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043856 Numbers n such that number of runs in the base 4 representation of n is congruent to 6 mod 8.
 * @author Georg Fischer
 */
public class A043856 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043856() {
    super(1);
    // mK = ensureWidth(8, 6);
  }

  @Override
  protected boolean isOk() {
    return getRunCount(mK, 4) % 8 == 6;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
