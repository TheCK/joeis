package irvine.oeis.a095;
// Generated by gen_seq4.pl holos [[0],[-4],[13],[-7],[1]] [2,14,72,330] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=7*a[n-1]-13*a[n-2]+4*a[n-3]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A095933 Number of walks of length 2n+1 between two nodes at distance 5 in the cycle graph C_10.
 * @author Georg Fischer
 */
public class A095933 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A095933() {
    super(2, "[[0],[-4],[13],[-7],[1]]", "[2,14,72,330]", 0);
  }
}
