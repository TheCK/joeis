package irvine.oeis.a181;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A181829 a(n) = 4*A060819(n-2)*A060819(n+2). 
 * @author Georg Fischer
 */
public class A181829 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181829() {
    super(new long[] {1L, 0L, 0L, 0L, -3L, 0L, 0L, 0L, 3L, 0L, 0L, 0L}, new long[] {0L, -12L, -4L, -12L, 0L, 20L, 12L, 84L, 8L, 180L, 60L, 308L});
  } // constructor()
} // A181829
