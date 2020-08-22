package irvine.oeis.a152;
// Generated by gen_seq4.pl holos [[0],[0,-4],[-4],[1,1]] [1,4,10] 1 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A152548 Sum of squared terms in rows of triangle A152547: a(n) = Sum_{k=0..C(n,[n/2])-1} A152547(n,k)^2.
 * @author Georg Fischer
 */
public class A152548 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A152548() {
    super(0, "[[0],[0,-4],[-4],[1,1]]", "[1,4,10]", 1);
  }
}
