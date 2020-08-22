package irvine.oeis.a050;
// Generated by gen_seq4.pl holos [[0],[-2,1],[-3,3],[-2,1],[-11,-5],[-22,-7],[-34,-7],[-57,-9],[-52,-7],[-7,-1],[10,1]] [1,1,1,4,10,27,79,238,736,2322] 9 at 2020-02-15 22:07
// Recurrence: (n-2)*a[n+0]+(-3+3*n)*a[n+1]+(n-2)*a[n+2]+(-11-5*n)*a[n+3]+(-22-7*n)*a[n+4]+(-34-7*n)*a[n+5]+(-57-9*n)*a[n+6]+(-52-7*n)*a[n+7]+(-7-n)*a[n+8]+(10+n)*a[n+9]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A050262 G.f.: ( 1 + x + x^2 - x^3 - x^4 - sqrt( 1 - 2 x - 5 x^2 - 4 x^3 - 3 x^4 - 4 x^5 - x^6 + 2 x^7 + x^8 ) ) / ( 2 x (1 + x) ).
 * @author Georg Fischer
 */
public class A050262 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A050262() {
    super(0, "[[0],[-2,1],[-3,3],[-2,1],[-11,-5],[-22,-7],[-34,-7],[-57,-9],[-52,-7],[-7,-1],[10,1]]", "[1,1,1,4,10,27,79,238,736,2322]", 9);
  }
}
