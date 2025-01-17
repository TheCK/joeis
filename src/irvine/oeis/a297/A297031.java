package irvine.oeis.a297;
// Generated by gen_seq4.pl baspiece at 2021-08-25 08:38

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A297031 Number of pieces in the list d(m), d(m-1), ..., d(0) of base-3 digits of n; see Comments.
 * @author Georg Fischer
 */
public class A297031 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A297031() {
    super(1);
  }

  @Override
  public Z next() {
    mK = mK.add(Z.ONE);
    return Z.valueOf(getPieceCount(mK, 3));
  }
}
