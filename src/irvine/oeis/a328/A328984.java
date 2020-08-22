package irvine.oeis.a328;
// Generated by gen_seq4.pl holos [[0],[1],[0],[-1],[0],[-1],[0],[1]] [1,3,7,5,11,8,17] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=a[n-2]+a[n-4]-a[n-6]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A328984 If n is even, a(n)=floor((5t+1)/2) where t=n/2; if n==1 (mod 4) then a(n)=10t+1 where t=(n-1)/4; and if n==3 (mod 4) then a(n)=10t+7 where t=(n-3)/4.
 * @author Georg Fischer
 */
public class A328984 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A328984() {
    super(1, "[[0],[1],[0],[-1],[0],[-1],[0],[1]]", "[1,3,7,5,11,8,17]", 0);
  }
}
