package irvine.oeis.a043;
// Generated by gen_seq4.pl basruneq 3 8 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043588 Numbers whose base-3 representation has exactly 8 runs.
 * @author Georg Fischer
 */
public class A043588 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043588() {
    super(1);
    mK = ensureWidth(8, 3);
  }

  @Override
  protected boolean isOk() {
    return hasRunCount(mK, 3, 8);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
