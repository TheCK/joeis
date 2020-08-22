package irvine.oeis.a332;
// Generated by gen_seq4.pl holos [[0],[-1000],[1110],[-111],[1]] [3,737,77377,7773777,777737777] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=111*a[n-1]-1110*a[n-2]+1000*a[n-3]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A332173 a(n) = 7*(10^(2n+1)-1)/9 - 4*10^n.
 * @author Georg Fischer
 */
public class A332173 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A332173() {
    super(0, "[[0],[-1000],[1110],[-111],[1]]", "[3,737,77377,7773777,777737777]", 0);
  }
}
