package irvine.oeis.a068;
// Generated by gen_seq4.pl holos [[0,5709042,-30931875,77301243,-118705077,125639547,-97292827,57031153,-25795983,9084089,-2491825,528254,-85011,10054,-825,42,-1],[24]] [7] 0 at 2020-03-14 22:45
// Recurrence: 24*a[n+0]=(n^16-42*n^15+825*n^14-10054*n^13+85011*n^12-528254*n^11+2491825*n^10-9084089*n^9+25795983*n^8-57031153*n^7+97292827*n^6-125639547*n^5+118705077*n^4-77301243*n^3+30931875*n^2-5709042*n)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A068251 1/24 the number of colorings of a 4 X 4 octagonal array with n colors.
 * @author Georg Fischer
 */
public class A068251 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A068251() {
    super(4, "[[0,5709042,-30931875,77301243,-118705077,125639547,-97292827,57031153,-25795983,9084089,-2491825,528254,-85011,10054,-825,42,-1],[24]]", "[7]", 0);
  }
}
