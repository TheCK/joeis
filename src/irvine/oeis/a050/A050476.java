package irvine.oeis.a050;
// Generated by gen_seq4.pl holos [[0],[-48,32],[-2,-28],[5,5]] [1,7,26,95] 0 at 2020-03-14 22:45
// Recurrence: 5*(n+1)*a[n+0]+2*(-14*n-1)*a[n-1]+16*(2*n-3)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A050476 a(n) = C(n)*(6n+1) where C(n)=Catalan numbers (A000108).
 * @author Georg Fischer
 */
public class A050476 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A050476() {
    super(0, "[[0],[-48,32],[-2,-28],[5,5]]", "[1,7,26,95]", 0);
  }
}
