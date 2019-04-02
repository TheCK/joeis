package irvine.oeis.a160;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A160840 Expansion of (1+147*x+1230*x^2+1885*x^3+714*x^4+63*x^5+x^6)/(1-x)^7. 
 * @author Georg Fischer
 */
public class A160840 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160840() {
    super(new long[] {1L, -7L, 21L, -35L, 35L, -21L, 7L}, new long[] {1L, 154L, 2287L, 14695L, 60907L, 192493L, 505912L});
  } // constructor()
} // A160840
