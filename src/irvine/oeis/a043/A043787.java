package irvine.oeis.a043;
// Generated by gen_seq4.pl basrunmod 3 2 6 at 2019-07-04 11:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043787 Numbers n such that number of runs in base 3 representation of n is congruent to 2 mod 6.
 * @author Georg Fischer
 */
public class A043787 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043787() {
    super(1);
    // mK = ensureWidth(6, 2);
  }

  @Override
  protected boolean isOk() {
    return getRunCount(mK, 3) % 6 == 2;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
