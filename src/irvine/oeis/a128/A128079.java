package irvine.oeis.a128;
// Generated by gen_seq4.pl holos [[0],[54,-81,27],[-18,57,-21],[-6,-11,-7],[2,3,1]] [1,3,13,69] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A128079 a(n) = Sum_{k=0..n} A000984(k)*A001263(n+1,k+1), where A000984 is the central binomial coefficients and A001263 is the Narayana triangle.
 * @author Georg Fischer
 */
public class A128079 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A128079() {
    super(0, "[[0],[54,-81,27],[-18,57,-21],[-6,-11,-7],[2,3,1]]", "[1,3,13,69]", 0);
  }
}
