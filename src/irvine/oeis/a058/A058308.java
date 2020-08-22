package irvine.oeis.a058;
// Generated by gen_seq4.pl holos [[0],[-1],[-2,-1],[1]] [0,1,4,21] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=(n+2)*a[n-1]+a[n-2]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A058308 a(n) = (n+2)*a(n-1) + a(n-2), with a(0)=0, a(1)=1.
 * @author Georg Fischer
 */
public class A058308 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A058308() {
    super(0, "[[0],[-1],[-2,-1],[1]]", "[0,1,4,21]", 0);
  }
}
