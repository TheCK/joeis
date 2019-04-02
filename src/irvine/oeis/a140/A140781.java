package irvine.oeis.a140;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A140781 a(n) = 10*a(n-1) - a(n-2). 
 * @author Georg Fischer
 */
public class A140781 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140781() {
    super(new long[] {-1L, 10L}, new long[] {1L, 2L});
  } // constructor()
} // A140781
