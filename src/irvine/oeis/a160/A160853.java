package irvine.oeis.a160;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A160853 Expansion of (1+147*x+1230*x^2+1925*x^3+754*x^4+67*x^5+x^6)/(1-x)^7. 
 * @author Georg Fischer
 */
public class A160853 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160853() {
    super(new long[] {1L, -7L, 21L, -35L, 35L, -21L, 7L}, new long[] {1L, 154L, 2287L, 14735L, 61227L, 193897L, 510420L});
  } // constructor()
} // A160853
