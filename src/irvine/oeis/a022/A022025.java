package irvine.oeis.a022;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A022025 Define the sequence S(a(0),a(1)) by a(n+2) is the least integer such that a(n+2)/a(n+1) &gt; a(n+1)/a(n) for n &gt;= 0. This is S(6,102). 
 * @author Georg Fischer
 */
public class A022025 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022025() {
    super(new long[] {-14L, 1L, 17L}, new long[] {6L, 102L, 1735L});
  } // constructor()
} // A022025
