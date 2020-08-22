package irvine.oeis.a043;
// Generated by gen_seq4.pl basrunmod 3 4 8 at 2019-07-04 11:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043802 Numbers n such that number of runs in the base 3 representation of n is congruent to 4 mod 8.
 * @author Georg Fischer
 */
public class A043802 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043802() {
    super(1);
    // mK = ensureWidth(8, 4);
  }

  @Override
  protected boolean isOk() {
    return getRunCount(mK, 3) % 8 == 4;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
