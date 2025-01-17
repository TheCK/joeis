package irvine.oeis.a127;
// Generated by gen_seq4.pl holos [[0],[16,-24,8],[-7,6],[1]] [1,1,-5] 0 at 2020-02-15 22:07
// Recurrence: a[n+0]+(6*n-7)*a[n-1]+8*(n-1)*(n-2)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A127189 E.g.f.: sqrt((1+4*x)/(1+2*x)).
 * @author Georg Fischer
 */
public class A127189 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A127189() {
    super(0, "[[0],[16,-24,8],[-7,6],[1]]", "[1,1,-5]", 0);
  }
}
