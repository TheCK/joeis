package irvine.oeis.a278;
// Generated by gen_seq4.pl holos [[0],[4,-2],[3,-4],[1,-2],[1]] [0,1,3,24,211] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=(2*n-1)*a[n-1]+(4*n-3)*a[n-2]+(2*n-4)*a[n-3]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A278991 a(n) is the number of simple linear diagrams with n+1 chords.
 * @author Georg Fischer
 */
public class A278991 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A278991() {
    super(0, "[[0],[4,-2],[3,-4],[1,-2],[1]]", "[0,1,3,24,211]", 0);
  }
}
