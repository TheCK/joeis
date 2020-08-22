package irvine.oeis.a322;
// Generated by gen_seq4.pl holos [[0],[7,7],[9,6],[-2,-1]] [1,3,17] 2 at 2020-02-15 22:07
// Recurrence: (7*n+7)*a[n+0]+(9+6*n)*a[n+1]+(-n-2)*a[n+2]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A322242 G.f.: 1/sqrt(1 - 6*x - 7*x^2).
 * @author Georg Fischer
 */
public class A322242 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A322242() {
    super(0, "[[0],[7,7],[9,6],[-2,-1]]", "[1,3,17]", 2);
  }
}
