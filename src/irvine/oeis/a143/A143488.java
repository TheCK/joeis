package irvine.oeis.a143;
// Generated by gen_seq4.pl holos [[0],[-1],[1],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[-1],[1]] [1,1,1,2,2,1,1,1,2,2,3,3,4,4] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=a[n-1]-a[n-12]+a[n-13]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A143488 "Fourth down, Extream [sic] between the two farthest Bells from it" in bell-ringing is a sequence of permutations p_1=(1,2,3,4), p_2=(1,2,4,3), .. which runs through all permutations of {1,2,3,4} with period 24; sequence gives position of bell 1 (the treble bell) in n-th permutation.
 * @author Georg Fischer
 */
public class A143488 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A143488() {
    super(1, "[[0],[-1],[1],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[-1],[1]]", "[1,1,1,2,2,1,1,1,2,2,3,3,4,4]", 0);
  }
}
