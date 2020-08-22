package irvine.oeis.a215;
// Generated by gen_seq4.pl holos [[0],[7680,-16832,10464,-1984],[-1920,7928,-7488,1984],[0,-2422,6486,-2852],[0,-495,-216,279]] [1,3,14,83] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A215661 G.f. satisfies: A(x) = (1 + 2*x*A(x)) * (1 + x*A(x)^2).
 * @author Georg Fischer
 */
public class A215661 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A215661() {
    super(0, "[[0],[7680,-16832,10464,-1984],[-1920,7928,-7488,1984],[0,-2422,6486,-2852],[0,-495,-216,279]]", "[1,3,14,83]", 0);
  }
}
