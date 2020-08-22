package irvine.oeis.a215;
// Generated by gen_seq4.pl holos [[0],[26,-4],[0],[54,-12],[0],[30,-12],[1,1],[2,-4],[1,1]] [1,1,3,8,24,80,278,997] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A215576 G.f. satisfies: A(x) = (1 + x^2)*(1 + x*A(x)^2).
 * @author Georg Fischer
 */
public class A215576 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A215576() {
    super(0, "[[0],[26,-4],[0],[54,-12],[0],[30,-12],[1,1],[2,-4],[1,1]]", "[1,1,3,8,24,80,278,997]", 0);
  }
}
