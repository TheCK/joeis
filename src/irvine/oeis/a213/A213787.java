package irvine.oeis.a213;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A213787 a(n) = Sum_{1&lt;=i&lt;j&lt;k&lt;=n} F(i)*F(j)*F(k), where F(m) is the m-th Fibonacci number. 
 * @author Georg Fischer
 */
public class A213787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213787() {
    super(new long[] {1L, 2L, -14L, -11L, 40L, 16L, -29L, -2L, 6L}, new long[] {0L, 0L, 0L, 2L, 17L, 102L, 518L, 2442L, 11010L});
  } // constructor()
} // A213787
