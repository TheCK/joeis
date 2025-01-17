package irvine.oeis.a330;
// Generated by gen_seq4.pl holos [[0],[-3,2],[1]] [1,1,-1] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=(3-2*n)*a[n-1]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A330797 Evaluation of the Stirling cycle polynomials at -1/2 and normalized with (-2)^n.
 * @author Georg Fischer
 */
public class A330797 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A330797() {
    super(0, "[[0],[-3,2],[1]]", "[1,1,-1]", 0);
  }
}
