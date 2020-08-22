package irvine.oeis.a140;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A140159 a(1)=1, a(n) = a(n-1) + n^4 if n odd, a(n) = a(n-1) + n^2 if n is even.
 * @author Georg Fischer
 */
public class A140159 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140159() {
    super(new long[] {-1L, 1L, 5L, -5L, -10L, 10L, 10L, -10L, -5L, 5L, 1L}, new long[] {1L, 5L, 86L, 102L, 727L, 763L, 3164L, 3228L, 9789L, 9889L, 24530L});
  } // constructor()
} // A140159
