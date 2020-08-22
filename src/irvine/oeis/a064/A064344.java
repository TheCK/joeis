package irvine.oeis.a064;
// Generated by gen_seq4.pl holos [[0],[-1296,864],[-1800,714],[5,-5]] [1,1,12,540] 0 at 2020-03-14 22:45
// Recurrence: 5*(-n+1)*a[n+0]+6*(119*n-300)*a[n-1]+432*(2*n-3)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A064344 Generalized Catalan numbers C(6,6; n).
 * @author Georg Fischer
 */
public class A064344 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A064344() {
    super(0, "[[0],[-1296,864],[-1800,714],[5,-5]]", "[1,1,12,540]", 0);
  }
}
