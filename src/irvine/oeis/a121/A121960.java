package irvine.oeis.a121;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A121960 G.f. x*(1+30*x+49*x^2-71*x^3-116*x^4)/((2*x+1) * (4*x^2+2*x-1) * (2*x^2-1)). 
 * @author Georg Fischer
 */
public class A121960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121960() {
    super(new long[] {-16L, -16L, 8L, 10L, 0L}, new long[] {1L, 30L, 59L, 237L, 698L});
  } // constructor()
} // A121960
