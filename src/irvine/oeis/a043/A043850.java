package irvine.oeis.a043;
// Generated by gen_seq4.pl basrunmod 4 0 8 at 2019-07-04 11:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043850 Numbers n such that number of runs in the base 4 representation of n is congruent to 0 mod 8.
 * @author Georg Fischer
 */
public class A043850 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043850() {
    super(1);
    // mK = ensureWidth(8, 0);
  }

  @Override
  protected boolean isOk() {
    return getRunCount(mK, 4) % 8 == 0;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
