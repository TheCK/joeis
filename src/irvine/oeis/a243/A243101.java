package irvine.oeis.a243;
// Generated by gen_seq4.pl holos [[0],[0,3,11,9,2],[-4,-28,-62,-48,-12],[-2,-3,5,7,2]] [-1,2,37] 2 at 2019-12-08 00:24
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A243101 a(n) = (sum_{k=0}^{n-1}(4*k^3-1)*C(n-1,k)*C(n+k,k))/n^2, where C(m,k) denotes the binomial coefficient m!/(k!*(m-k)!).
 * @author Georg Fischer
 */
public class A243101 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A243101() {
    super(1, "[[0],[0,3,11,9,2],[-4,-28,-62,-48,-12],[-2,-3,5,7,2]]", "[-1,2,37]", 2);
  }
}
