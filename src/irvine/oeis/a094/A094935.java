package irvine.oeis.a094;
// Generated by gen_seq4.pl holos [[0],[-64,64],[-1,-8],[1]] [1,9,89] 0 at 2020-02-15 22:07
// Recurrence: a[n+0]+(-8*n-1)*a[n-1]+64*(n-1)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A094935 E.g.f.: exp(8x)/(1-8x)^(1/8).
 * @author Georg Fischer
 */
public class A094935 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A094935() {
    super(0, "[[0],[-64,64],[-1,-8],[1]]", "[1,9,89]", 0);
  }
}
