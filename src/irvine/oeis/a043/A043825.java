package irvine.oeis.a043;
// Generated by gen_seq4.pl basrunmod 4 0 3 at 2019-07-04 11:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043825 Numbers n such that number of runs in the base 4 representation of n is congruent to 0 mod 3.
 * @author Georg Fischer
 */
public class A043825 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043825() {
    super(1);
    // mK = ensureWidth(3, 0);
  }

  @Override
  protected boolean isOk() {
    return getRunCount(mK, 4) % 3 == 0;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
