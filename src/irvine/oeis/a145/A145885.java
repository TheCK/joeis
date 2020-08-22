package irvine.oeis.a145;
// Generated by gen_seq4.pl holos [[0],[2,-8,10,-4],[4,0,-3,1]] [0,1] 0 at 2019-12-08 00:24
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A145885 a(n) = (n-1)^2*binomial(2n,n)/(2*(n+1)).
 * @author Georg Fischer
 */
public class A145885 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A145885() {
    super(1, "[[0],[2,-8,10,-4],[4,0,-3,1]]", "[0,1]", 0);
  }
}
