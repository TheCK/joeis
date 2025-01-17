package irvine.oeis.a331;
// Generated by gen_seq4.pl holos [[0],[0,9,18],[-4,0,4],[0,-1,2]] [1,0,-15,32] 0 at 2020-03-14 22:45
// Recurrence: n*(2*n-1)*a[n+0]=4*(-n^2+1)*a[n-1]-9*n*(2*n+1)*a[n-2]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A331551 Expansion of (1 + 3*x)/(1 + 2*x + 9*x^2)^(3/2).
 * @author Georg Fischer
 */
public class A331551 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A331551() {
    super(0, "[[0],[0,9,18],[-4,0,4],[0,-1,2]]", "[1,0,-15,32]", 0);
  }
}
