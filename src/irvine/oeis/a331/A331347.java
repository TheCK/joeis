package irvine.oeis.a331;
// Generated by gen_seq4.pl holos [[0],[1],[-5],[8],[-5],[1]] [1,2,6,15,37] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=5*a[n-1]-8*a[n-2]+5*a[n-3]-a[n-4]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A331347 Number of permutations w in S_n that form Boolean intervals [s, w] in the Bruhat order for every simple reflection s in the support of w.
 * @author Georg Fischer
 */
public class A331347 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A331347() {
    super(1, "[[0],[1],[-5],[8],[-5],[1]]", "[1,2,6,15,37]", 0);
  }
}
