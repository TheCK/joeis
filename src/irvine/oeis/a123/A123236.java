package irvine.oeis.a123;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A123236 a(n) = 10*a(n-1) + 44*a(n-2) - 370*a(n-3) - 240*a(n-4) + 2400*a(n-5), a(1) = 1, a(2) = 1, a(3) = 31, a(4) = 134, a(5) = 2094, for n &gt;= 6. 
 * @author Georg Fischer
 */
public class A123236 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123236() {
    super(new long[] {2400L, -240L, -370L, 44L, 10L}, new long[] {1L, 1L, 31L, 134L, 2094L});
  } // constructor()
} // A123236
