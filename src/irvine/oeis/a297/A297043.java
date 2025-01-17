package irvine.oeis.a297;
// Generated by gen_seq4.pl baspiece at 2021-08-25 08:38

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A297043 Number of pieces in the list d(m), d(m-1), ..., d(0) of base-15 digits of n; see Comments.
 * @author Georg Fischer
 */
public class A297043 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A297043() {
    super(1);
  }

  @Override
  public Z next() {
    mK = mK.add(Z.ONE);
    return Z.valueOf(getPieceCount(mK, 15));
  }
}
