package irvine.oeis.a093;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A093960 <code>a(1) = 1, a(2) = 2, a(n + 1) = n*a(1) + (n-1)*a(2) + </code>...(n-r)*a(r <code>+ 1) + ... + a(n)</code>.
 * @author Georg Fischer
 */
public class A093960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093960() {
    super(new long[] {-1L, 3L}, new long[] {4L, 11L}, new long[] {1L, 2L});
  } // constructor()
} // A093960
