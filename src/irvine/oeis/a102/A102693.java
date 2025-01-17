package irvine.oeis.a102;
// Generated by gen_seq4.pl holos at 2021-07-07 22:49

import irvine.oeis.HolonomicRecurrence;

/**
 * A102693 a(n) is the number of digraphs (not allowing loops) with vertices 1,2,...,n that have a unique Eulerian tour (up to cyclic shift).
 * 2*(n-1)*(2*n-1)*a(n-1)-a(n)*(n+1)
 * @author Georg Fischer
 */
public class A102693 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A102693() {
    super(2, "[[0],[2,-6, 4],[-1,-1]]", "[1, 5]", 0);
  }
}
