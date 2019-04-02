package irvine.oeis.a317;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A317975 a(n) = 2*(a(n-1)+a(n-2)+a(n-3))-a(n-4) for n &gt;= 4, with initial terms 0, 1, 1, 0. 
 * @author Georg Fischer
 */
public class A317975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A317975() {
    super(new long[] {-1L, 2L, 2L, 2L}, new long[] {0L, 1L, 1L, 0L});
  } // constructor()
} // A317975
