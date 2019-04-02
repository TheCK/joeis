package irvine.oeis.a109;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A109164 a(n) = 4*a(n-1) - 4*a(n-2) + a(n-3), n &gt;= 3. 
 * @author Georg Fischer
 */
public class A109164 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109164() {
    super(new long[] {1L, -4L, 4L}, new long[] {1L, 6L, 20L});
  } // constructor()
} // A109164
