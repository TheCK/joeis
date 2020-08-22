package irvine.oeis.a307;
// Generated by gen_seq4.pl holos [[0],[-2,4],[-2,3],[4,-9],[0,2]] [1,2,6,19] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A307354 a(n) = Sum_{0&lt;=i&lt;=j&lt;=n} (-1)^(i+j) * (i+j)!/(i!*j!).
 * @author Georg Fischer
 */
public class A307354 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A307354() {
    super(0, "[[0],[-2,4],[-2,3],[4,-9],[0,2]]", "[1,2,6,19]", 0);
  }
}
