package irvine.oeis.a296;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A296518 a(1) = 3, a(2) = a(5) = 1, a(3) = a(4) = a(6) = 2; a(n) = a(n-a(n-1)) + a(n-a(n-2)) + a(n-a(n-3)) for n &gt; 6.
 * @author Georg Fischer
 */
public class A296518 extends LinearRecurrence {

  /** Construct the sequence. */
  public A296518() {
    super(new long[] {-1L, 0L, 0L, 0L, 2L, 0L, 0L, 0L}, new long[] {4L, 8L, 8L, 4L, 8L, 12L, 12L, 4L}, 3L, 1L, 2L, 2L, 1L, 2L);
  } // constructor()
} // A296518
