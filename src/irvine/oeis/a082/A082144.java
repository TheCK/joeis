package irvine.oeis.a082;
// Generated by gen_seq4.pl holos [[0],[-16,32],[-12,-12],[2,1]] [1,4,30,224] 0 at 2020-03-14 22:45
// Recurrence: (n+2)*a[n+0]+12*(-n-1)*a[n-1]+16*(2*n-1)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A082144 A subdiagonal of number array A082137.
 * @author Georg Fischer
 */
public class A082144 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A082144() {
    super(0, "[[0],[-16,32],[-12,-12],[2,1]]", "[1,4,30,224]", 0);
  }
}
