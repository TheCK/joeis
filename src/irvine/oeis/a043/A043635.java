package irvine.oeis.a043;
// Generated by gen_seq4.pl basruneq 9 6 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043635 Numbers whose base-9 representation has exactly 6 runs.
 * @author Georg Fischer
 */
public class A043635 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043635() {
    super(1);
    mK = ensureWidth(6, 9);
  }

  @Override
  protected boolean isOk() {
    return hasRunCount(mK, 9, 6);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
