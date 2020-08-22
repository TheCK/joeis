package irvine.oeis.a119;
// Generated by gen_seq4.pl holos [[0],[16,-8],[12,-12],[-4,-2],[1,1]] [1,3,12,50] 0 at 2020-02-15 22:07
// Recurrence: (n+1)*a[n+0]-2*(n+2)*a[n-1]+12*(1-n)*a[n-2]+8*(2-n)*a[n-3]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A119976 E.g.f. exp(2x)*(Bessel_I(0,2*sqrt(2)x) + Bessel_I(1,2*sqrt(2)x)/sqrt(2)).
 * @author Georg Fischer
 */
public class A119976 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A119976() {
    super(0, "[[0],[16,-8],[12,-12],[-4,-2],[1,1]]", "[1,3,12,50]", 0);
  }
}
