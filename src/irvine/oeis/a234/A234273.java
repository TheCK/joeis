package irvine.oeis.a234;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A234273 G.f.: (1+x+x^2+x^3)/(1-x^2-2*x^3-x^4+x^6). 
 * @author Georg Fischer
 */
public class A234273 extends LinearRecurrence {

  /** Construct the sequence. */
  public A234273() {
    super(new long[] {-1L, 0L, 1L, 2L, 1L, 0L}, new long[] {1L, 1L, 2L, 4L, 5L, 9L});
  } // constructor()
} // A234273
