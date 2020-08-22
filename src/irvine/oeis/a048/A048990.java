package irvine.oeis.a048;
// Generated by gen_seq4.pl holos [[0],[-6,32,-32],[0,1,2]] [1,2,14] 0 at 2020-03-14 22:45
// Recurrence: n*(2*n+1)*a[n+0]-2*(4*n-1)*(4*n-3)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A048990 Catalan numbers with even index (A000108(2*n), n &gt;= 0): a(n) = binomial(4*n, 2*n)/(2*n+1).
 * @author Georg Fischer
 */
public class A048990 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A048990() {
    super(0, "[[0],[-6,32,-32],[0,1,2]]", "[1,2,14]", 0);
  }
}
