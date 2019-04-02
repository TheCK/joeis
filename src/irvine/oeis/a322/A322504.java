package irvine.oeis.a322;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A322504 a(n) = -4*a(n-1) - 3*a(n-2) + a(n-3), a(0) = 1, a(1) = -2, a(2) = 4. 
 * @author Georg Fischer
 */
public class A322504 extends LinearRecurrence {

  /** Construct the sequence. */
  public A322504() {
    super(new long[] {1L, -3L, -4L}, new long[] {1L, -2L, 4L});
  } // constructor()
} // A322504
