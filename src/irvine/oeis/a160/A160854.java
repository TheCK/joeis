package irvine.oeis.a160;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A160854 Expansion of (1+147*x+1098*x^2+1638*x^3+632*x^4+59*x^5+x^6)/(1-x)^7. 
 * @author Georg Fischer
 */
public class A160854 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160854() {
    super(new long[] {1L, -7L, 21L, -35L, 35L, -21L, 7L}, new long[] {1L, 154L, 2155L, 13524L, 55400L, 173911L, 455120L});
  } // constructor()
} // A160854
