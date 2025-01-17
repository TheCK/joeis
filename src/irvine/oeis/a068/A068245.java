package irvine.oeis.a068;
// Generated by gen_seq4.pl holos [[0,226720,-1445104,4304712,-7968348,10265148,-9755858,7068408,-3975561,1749715,-602408,160859,-32703,4898,-510,33,-1],[6]] [1] 0 at 2020-03-14 22:45
// Recurrence: 6*a[n+0]=(n^16-33*n^15+510*n^14-4898*n^13+32703*n^12-160859*n^11+602408*n^10-1749715*n^9+3975561*n^8-7068408*n^7+9755858*n^6-10265148*n^5+7968348*n^4-4304712*n^3+1445104*n^2-226720*n)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A068245 1/6 the number of colorings of a 4 X 4 rhombic- or staggered- hexagonal array with n colors.
 * @author Georg Fischer
 */
public class A068245 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A068245() {
    super(3, "[[0,226720,-1445104,4304712,-7968348,10265148,-9755858,7068408,-3975561,1749715,-602408,160859,-32703,4898,-510,33,-1],[6]]", "[1]", 0);
  }
}
