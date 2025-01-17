package irvine.oeis.a331;
// Generated by gen_seq4.pl holos [[0,0,0,0,-48,0,-32,0,-36,0,0,0,-32,0,0,0,-19,0,-24,0,0,0,0,0,0,0,0,0,0,0,0,0,-1],[192]] [1] 0 at 2020-03-14 22:45
// Recurrence: 192*a[n+0]=(48*n^4+32*n^6+36*n^8+32*n^12+19*n^16+24*n^18+n^32)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A331358 Number of oriented colorings of the edges of a tesseract with n available colors.
 * @author Georg Fischer
 */
public class A331358 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A331358() {
    super(1, "[[0,0,0,0,-48,0,-32,0,-36,0,0,0,-32,0,0,0,-19,0,-24,0,0,0,0,0,0,0,0,0,0,0,0,0,-1],[192]]", "[1]", 0);
  }
}
