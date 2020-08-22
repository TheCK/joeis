package irvine.oeis.a043;
// Generated by gen_seq4.pl basrunmod 4 7 10 at 2019-07-04 11:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043874 Numbers n such that number of runs in the base 4 representation of n is congruent to 7 mod 10.
 * @author Georg Fischer
 */
public class A043874 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043874() {
    super(1);
    // mK = ensureWidth(10, 7);
  }

  @Override
  protected boolean isOk() {
    return getRunCount(mK, 4) % 10 == 7;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
