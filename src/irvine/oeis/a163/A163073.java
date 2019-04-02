package irvine.oeis.a163;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A163073 a(n) = ((5+sqrt(5))*(4+sqrt(5))^n + (5-sqrt(5))*(4-sqrt(5))^n)/10. 
 * @author Georg Fischer
 */
public class A163073 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163073() {
    super(new long[] {-11L, 8L}, new long[] {1L, 5L});
  } // constructor()
} // A163073
