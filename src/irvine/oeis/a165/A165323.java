package irvine.oeis.a165;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A165323 a(0)=1, a(1)=8, a(n)=17*a(n-1)-64*a(n-2) for n&gt;1. 
 * @author Georg Fischer
 */
public class A165323 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165323() {
    super(new long[] {-64L, 17L}, new long[] {1L, 8L});
  } // constructor()
} // A165323
