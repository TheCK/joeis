package irvine.oeis.a050;
// Generated by gen_seq4.pl holos [[0],[-54,36],[-1,-29],[5,5]] [1,12,46,170] 0 at 2020-03-14 22:45
// Recurrence: 5*(n+1)*a[n+0]+(-29*n-1)*a[n-1]+18*(2*n-3)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A050490 a(n) = C(n)*(11n+1) where C(n)=Catalan numbers (A000108).
 * @author Georg Fischer
 */
public class A050490 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A050490() {
    super(0, "[[0],[-54,36],[-1,-29],[5,5]]", "[1,12,46,170]", 0);
  }
}
