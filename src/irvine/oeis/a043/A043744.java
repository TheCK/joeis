package irvine.oeis.a043;
// Generated by gen_seq4.pl basrunmod 2 5 7 at 2019-07-04 11:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043744 Numbers n such that number of runs in the base 2 representation of n is congruent to 5 mod 7.
 * @author Georg Fischer
 */
public class A043744 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043744() {
    super(1);
    // mK = ensureWidth(7, 5);
  }

  @Override
  protected boolean isOk() {
    return getRunCount(mK, 2) % 7 == 5;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
