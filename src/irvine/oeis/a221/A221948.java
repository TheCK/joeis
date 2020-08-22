package irvine.oeis.a221;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A221948 Expansion of (x-5*x^2+11*x^3-12*x^4+7*x^5-2*x^6+x^7) / (1-6*x+15*x^2-20*x^3+15*x^4-6*x^5+x^6).
 * @author Georg Fischer
 */
public class A221948 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221948() {
    super(new long[] {-1L, 6L, -15L, 20L, -15L, 6L}, new long[] {1L, 2L, 5L, 12L, 26L, 52L}, 0L, 1L);
  } // constructor()
} // A221948
