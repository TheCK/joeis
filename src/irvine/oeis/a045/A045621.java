package irvine.oeis.a045;
// Generated by gen_seq4.pl holos [[0],[-16,8],[8,-4],[-2,-2],[1,1]] [0,1,2,5,10] 0 at 2020-03-14 22:45
// Recurrence: (n+1)*a[n+0]+2*(-n-1)*a[n-1]+4*(-n+2)*a[n-2]+8*(n-2)*a[n-3]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A045621 a(n) = 2^n - binomial(n, floor(n/2)).
 * @author Georg Fischer
 */
public class A045621 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A045621() {
    super(0, "[[0],[-16,8],[8,-4],[-2,-2],[1,1]]", "[0,1,2,5,10]", 0);
  }
}
