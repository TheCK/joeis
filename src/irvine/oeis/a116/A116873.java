package irvine.oeis.a116;
// Generated by gen_seq4.pl holos [[0],[-180,72],[-237,93],[-56,20],[1,-1]] [1,1,5,49,653] 0 at 2020-03-14 22:45
// Recurrence: (1-n)*a[n+0]+4*(5*n-14)*a[n-1]+3*(31*n-79)*a[n-2]+36*(2*n-5)*a[n-3]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A116873 Generalized Catalan numbers C(2,3;n)=C(3,2;n).
 * @author Georg Fischer
 */
public class A116873 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A116873() {
    super(0, "[[0],[-180,72],[-237,93],[-56,20],[1,-1]]", "[1,1,5,49,653]", 0);
  }
}
