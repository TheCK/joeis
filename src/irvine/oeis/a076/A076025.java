package irvine.oeis.a076;
// Generated by gen_seq4.pl holos [[0],[-96,64],[18,-28],[0,3]] [1,1,5] 0 at 2020-02-15 22:07
// Recurrence: 3*n*a[n+0]+2*(9-14*n)*a[n-1]+32*(2*n-3)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A076025 Expansion of g.f.: (1-3*x*C)/(1-4*x*C) where C = (1 - sqrt(1-4*x))/(2*x) = g.f. for Catalan numbers A000108.
 * @author Georg Fischer
 */
public class A076025 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A076025() {
    super(0, "[[0],[-96,64],[18,-28],[0,3]]", "[1,1,5]", 0);
  }
}
