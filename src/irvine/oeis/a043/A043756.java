package irvine.oeis.a043;
// Generated by gen_seq4.pl basrunmod 2 2 9 at 2019-07-04 11:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043756 Numbers n such that number of runs in the base 2 representation of n is congruent to 2 mod 9.
 * @author Georg Fischer
 */
public class A043756 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043756() {
    super(1);
    // mK = ensureWidth(9, 2);
  }

  @Override
  protected boolean isOk() {
    return getRunCount(mK, 2) % 9 == 2;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
