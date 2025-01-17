package irvine.oeis.a043;
// Generated by gen_seq4.pl basrunmod 2 0 10 at 2019-07-04 11:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043763 Numbers n such that number of runs in the base 2 representation of n is congruent to 0 mod 10.
 * @author Georg Fischer
 */
public class A043763 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043763() {
    super(1);
    // mK = ensureWidth(10, 0);
  }

  @Override
  protected boolean isOk() {
    return getRunCount(mK, 2) % 10 == 0;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
