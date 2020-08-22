package irvine.oeis.a065;
// Generated by gen_seq4.pl holos [[0],[-1],[-3,6],[1]] [1,-2,19,-287] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=-(6*n-3)*a[n-1]+a[n-2]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A065923 Bessel polynomial y_n(-3).
 * @author Georg Fischer
 */
public class A065923 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A065923() {
    super(0, "[[0],[-1],[-3,6],[1]]", "[1,-2,19,-287]", 0);
  }
}
