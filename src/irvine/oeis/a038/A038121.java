package irvine.oeis.a038;
// Generated by gen_seq4.pl holos [[0],[-15,-11,-2],[0,1]] [1,28,630] 0 at 2020-03-14 22:45
// Recurrence: n*a[n+0]-(n+3)*(2*n+5)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A038121 E.g.f.: (1 + 15*x + (45/2)*x^2 + (5/2)*x^3)/(1 - 2*x)^(13/2).
 * @author Georg Fischer
 */
public class A038121 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A038121() {
    super(0, "[[0],[-15,-11,-2],[0,1]]", "[1,28,630]", 0);
  }
}
