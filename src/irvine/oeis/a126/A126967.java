package irvine.oeis.a126;
// Generated by gen_seq4.pl holos [[0],[12,-20,8],[-6,6],[1]] [1,0,-4] 0 at 2020-02-15 22:07
// Recurrence: a[n+0]+6*(n-1)*a[n-1]+4*(n-1)*(2*n-3)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A126967 Expansion of e.g.f.: sqrt(1+4*x)/(1+2*x).
 * @author Georg Fischer
 */
public class A126967 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A126967() {
    super(0, "[[0],[12,-20,8],[-6,6],[1]]", "[1,0,-4]", 0);
  }
}
