package irvine.oeis.a116;
// Generated by gen_seq4.pl holos [[0],[-640,256],[-1112,440],[-226,82],[3,-3]] [1,1,6,76,1336] 0 at 2020-03-14 22:45
// Recurrence: 3*(-n+1)*a[n+0]+2*(41*n-113)*a[n-1]+8*(55*n-139)*a[n-2]+128*(2*n-5)*a[n-3]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A116874 Generalized Catalan numbers C(2,4;n)=C(4,2;n).
 * @author Georg Fischer
 */
public class A116874 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A116874() {
    super(0, "[[0],[-640,256],[-1112,440],[-226,82],[3,-3]]", "[1,1,6,76,1336]", 0);
  }
}
