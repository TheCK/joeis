package irvine.oeis.a110;
// Generated by gen_seq4.pl holos [[0],[0,6,-5,1],[2,1,-1],[2,-4],[4]] [0,1,3,7] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A110505 Numerators of unsigned columns of triangle A110504: a(n) = n!*A110504(n,0) = (-1)^k*n!*A110504(n+k,k) for all k &gt;= 0.
 * @author Georg Fischer
 */
public class A110505 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A110505() {
    super(0, "[[0],[0,6,-5,1],[2,1,-1],[2,-4],[4]]", "[0,1,3,7]", 0);
  }
}
