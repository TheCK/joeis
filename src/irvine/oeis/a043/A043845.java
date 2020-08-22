package irvine.oeis.a043;
// Generated by gen_seq4.pl basrunmod 4 2 7 at 2019-07-04 11:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043845 Numbers n such that number of runs in the base 4 representation of n is congruent to 2 mod 7.
 * @author Georg Fischer
 */
public class A043845 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043845() {
    super(1);
    // mK = ensureWidth(7, 2);
  }

  @Override
  protected boolean isOk() {
    return getRunCount(mK, 4) % 7 == 2;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
