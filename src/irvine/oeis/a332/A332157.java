package irvine.oeis.a332;
// Generated by gen_seq4.pl holos [[0],[-1000],[1110],[-111],[1]] [7,575,55755,5557555,555575555] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=111*a[n-1]-1110*a[n-2]+1000*a[n-3]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A332157 a(n) = 5*(10^(2*n+1)-1)/9 + 2*10^n.
 * @author Georg Fischer
 */
public class A332157 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A332157() {
    super(0, "[[0],[-1000],[1110],[-111],[1]]", "[7,575,55755,5557555,555575555]", 0);
  }
}
