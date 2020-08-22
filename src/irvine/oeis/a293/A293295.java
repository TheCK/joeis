package irvine.oeis.a293;
// Generated by gen_seq4.pl holos [[0],[-2,2,-1],[1,2,-3,1],[3,-5,2],[-2,-3,3,-1],[5,-4,1]] [1,5,27,142,847] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A293295 a(n) = Sum_{k=1..n} (-1)^(n-k)*hypergeom([k, k-2-n], [], 1).
 * @author Georg Fischer
 */
public class A293295 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A293295() {
    super(1, "[[0],[-2,2,-1],[1,2,-3,1],[3,-5,2],[-2,-3,3,-1],[5,-4,1]]", "[1,5,27,142,847]", 0);
  }
}
