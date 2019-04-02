package irvine.oeis.a192;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A192920 Coefficient of x in the reduction by (x^2-&gt;x+1) of the polynomial F(n+4)*x^n, where F=A000045 (Fibonacci sequence). 
 * @author Georg Fischer
 */
public class A192920 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192920() {
    super(new long[] {-1L, 2L, 2L}, new long[] {0L, 5L, 8L});
  } // constructor()
} // A192920
