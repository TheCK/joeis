package irvine.oeis.a317;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A317973 a(n) = 2*(a(n-1)+a(n-2)+a(n-3))-a(n-4) for n &gt;= 4, with initial terms -1, 2, 3, 6. 
 * @author Georg Fischer
 */
public class A317973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A317973() {
    super(new long[] {-1L, 2L, 2L, 2L}, new long[] {-1L, 2L, 3L, 6L});
  } // constructor()
} // A317973
