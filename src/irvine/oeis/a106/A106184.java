package irvine.oeis.a106;
// Generated by gen_seq4.pl holos [[0],[-48,32],[8,-8],[2,-4],[0,1]] [1,2,10,28] 0 at 2020-02-15 22:07
// Recurrence: n*a[n+0]+2*(1-2*n)*a[n-1]+8*(1-n)*a[n-2]+16*(2*n-3)*a[n-3]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A106184 Expansion of 1/sqrt(1-4*x-8*x^2+32*x^3).
 * @author Georg Fischer
 */
public class A106184 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A106184() {
    super(0, "[[0],[-48,32],[8,-8],[2,-4],[0,1]]", "[1,2,10,28]", 0);
  }
}
