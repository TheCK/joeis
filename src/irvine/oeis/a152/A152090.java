package irvine.oeis.a152;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A152090 a(n) = 2^n*Product_{k=1..floor((n-1)/2)} (1 + 2*cos(k*Pi/n)^2 + 4*cos(k*Pi/n)^4).
 * @author Georg Fischer
 */
public class A152090 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152090() {
    super(new long[] {-1L, 1L, 3L, 1L}, new long[] {1L, 1L, 3L, 7L}, 1L);
  } // constructor()
} // A152090
