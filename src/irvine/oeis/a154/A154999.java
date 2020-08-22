package irvine.oeis.a154;
// Generated by gen_seq4.pl holos [[0],[-42],[-7],[1]] [1,1,13,133] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=7*a[n-1]+42*a[n-2]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A154999 a(n)=7*a(n-1)+42*a(n-2), n&gt;2 ; a(0)=1, a(1)=1, a(2)=13 .
 * @author Georg Fischer
 */
public class A154999 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A154999() {
    super(0, "[[0],[-42],[-7],[1]]", "[1,1,13,133]", 0);
  }
}
