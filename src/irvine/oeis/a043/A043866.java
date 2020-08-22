package irvine.oeis.a043;
// Generated by gen_seq4.pl basrunmod 4 8 9 at 2019-07-04 11:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043866 Numbers n such that number of runs in the base 4 representation of n is congruent to 8 mod 9.
 * @author Georg Fischer
 */
public class A043866 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043866() {
    super(1);
    // mK = ensureWidth(9, 8);
  }

  @Override
  protected boolean isOk() {
    return getRunCount(mK, 4) % 9 == 8;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
