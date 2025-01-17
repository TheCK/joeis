package irvine.oeis.a043;
// Generated by gen_seq4.pl basruneq 6 3 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043611 Numbers whose base-6 representation has exactly 3 runs.
 * @author Georg Fischer
 */
public class A043611 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043611() {
    super(1);
    mK = ensureWidth(3, 6);
  }

  @Override
  protected boolean isOk() {
    return hasRunCount(mK, 6, 3);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
