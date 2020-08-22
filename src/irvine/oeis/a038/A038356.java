package irvine.oeis.a038;
// Generated by gen_seq4.pl basdig2 6 count1 != 0 && 3 5 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A038356 Numbers n such that representation in base 6 has same nonzero number of 3's and 5's.
 * @author Georg Fischer
 */
public class A038356 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A038356() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    final int count1 =  getDigitCount(mK, 6, 3);
    return count1 != 0 && count1 == getDigitCount(mK, 6, 5);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
