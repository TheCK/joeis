package irvine.oeis.a318;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A318406 For n &gt; 4, a(n) = a(n-1) + a(n-2) if n is even and a(n) = 3*a(n-2) + a(n-4) - a(n-5) if n is odd; a(0) = 0, a(1) = 1, a(2) = 1, a(3) = 2, and a(4) = 3. 
 * @author Georg Fischer
 */
public class A318406 extends LinearRecurrence {

  /** Construct the sequence. */
  public A318406() {
    super(new long[] {-2L, 0L, -2L, 0L, 4L, 0L}, new long[] {0L, 1L, 1L, 2L, 3L, 7L});
  } // constructor()
} // A318406
