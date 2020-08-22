package irvine.oeis.a107;
// Generated by gen_seq4.pl holos [[0],[16,-8],[-8,4],[-2,2],[1,-1]] [0,0,1,2] 0 at 2019-12-08 00:24
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A107373 a(n) = (n/2)*binomial(n-1, floor((n-1)/2)) - 2^(n-2).
 * @author Georg Fischer
 */
public class A107373 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A107373() {
    super(1, "[[0],[16,-8],[-8,4],[-2,2],[1,-1]]", "[0,0,1,2]", 0);
  }
}
