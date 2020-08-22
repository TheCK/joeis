package irvine.oeis.a159;
// Generated by gen_seq4.pl holos [[0],[-242,242],[-21],[1]] [1,21,199,-5985] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=21*a[n-1]+242*(1-n)*a[n-2]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A159857 Numerator of Hermite(n, 21/22).
 * @author Georg Fischer
 */
public class A159857 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A159857() {
    super(0, "[[0],[-242,242],[-21],[1]]", "[1,21,199,-5985]", 0);
  }
}
