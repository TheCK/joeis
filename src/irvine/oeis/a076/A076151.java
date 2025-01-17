package irvine.oeis.a076;
// Generated by gen_seq4.pl holos [[0],[6,-33,54,-27],[0,2,4]] [1,8] 0 at 2020-03-14 22:45
// Recurrence: 2*n*(2*n+1)*a[n+0]-3*(n-1)*(3*n-1)*(3*n-2)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A076151 (n-1)!*binomial(3*n,n)/(3*(2*n+1)).
 * @author Georg Fischer
 */
public class A076151 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A076151() {
    super(2, "[[0],[6,-33,54,-27],[0,2,4]]", "[1,8]", 0);
  }
}
