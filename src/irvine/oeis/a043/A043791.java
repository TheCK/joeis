package irvine.oeis.a043;
// Generated by gen_seq4.pl basrunmod 3 0 7 at 2019-07-04 11:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043791 Numbers whose number of runs in base 3 is congruent to 0 (mod 7).
 * @author Georg Fischer
 */
public class A043791 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043791() {
    super(1);
    // mK = ensureWidth(7, 0);
  }

  @Override
  protected boolean isOk() {
    return getRunCount(mK, 3) % 7 == 0;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
