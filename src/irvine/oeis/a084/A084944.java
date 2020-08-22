package irvine.oeis.a084;
// Generated by gen_seq4.pl holos [[0],[0,7,-9],[2]] [1,1,11] 0 at 2020-03-14 22:45
// Recurrence: 2*a[n+0]=n*(9*n-7)*a[n-1]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A084944 Hendecagorials: n-th polygorial for k=11.
 * @author Georg Fischer
 */
public class A084944 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A084944() {
    super(0, "[[0],[0,7,-9],[2]]", "[1,1,11]", 0);
  }
}
