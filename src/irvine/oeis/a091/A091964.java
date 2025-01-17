package irvine.oeis.a091;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A091964 Number of left factors of peakless Motzkin paths of length n.
 * Recurrence: (n+1)*a(n)+2*(-n-1)*a(n-1)+(-n+1)*a(n-2)+2*(-n+3)*a(n-3)+(n-3)*a(n-4)=0
 * @author Georg Fischer
 */
public class A091964 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A091964() {
    super(0, "[[0],[3,-1],[-6, 2],[-1, 1],[2, 2],[-1,-1]]", "1, 2, 4, 9, 21, 50, 121, 296, 730, 1812", 0);
  }
}
