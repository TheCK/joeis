package irvine.oeis.a043;
// Generated by gen_seq4.pl basrunmod 3 2 10 at 2019-07-04 11:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A043817 Numbers n such that number of runs in base 3 representation of n is congruent to 2 mod 10.
 * @author Georg Fischer
 */
public class A043817 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043817() {
    super(1);
    // mK = ensureWidth(10, 2);
  }

  @Override
  protected boolean isOk() {
    return getRunCount(mK, 3) % 10 == 2;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
