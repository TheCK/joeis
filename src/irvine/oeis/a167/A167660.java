package irvine.oeis.a167;
// Generated by gen_seq4.pl holos [[0],[-20,28,-8],[-44,66,-18],[28,-9,-3],[0,-4,2]] [0,1,5,23] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A167660 Chocolate dove bar numerator: a(n) = (Sum_{k=0..floor(n/2)} k*binomial(n+k,k)*binomial(n,n-2*k)) + (Sum_{k=0..ceiling(n/2)} k*binomial(n+k-1,k-1)*binomial(n,n-2*k+1)).
 * @author Georg Fischer
 */
public class A167660 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A167660() {
    super(0, "[[0],[-20,28,-8],[-44,66,-18],[28,-9,-3],[0,-4,2]]", "[0,1,5,23]", 0);
  }
}
