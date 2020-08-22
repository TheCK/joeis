package irvine.oeis.a176;
// Generated by gen_seq4.pl holos [[0],[1,-1],[-9,-1],[1]] [1,10,111,1352] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=(n+9)*a[n-1]+(n-1)*a[n-2]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A176736 a(n) = (n+9)*a(n-1) + (n-1)*a(n-2), a(-1)=0, a(0)=1.
 * @author Georg Fischer
 */
public class A176736 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A176736() {
    super(0, "[[0],[1,-1],[-9,-1],[1]]", "[1,10,111,1352]", 0);
  }
}
