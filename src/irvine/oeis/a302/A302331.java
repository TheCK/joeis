package irvine.oeis.a302;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A302331 a(0)=1, a(1)=141; for n&gt;1, a(n) = 142*a(n-1) - a(n-2). 
 * @author Georg Fischer
 */
public class A302331 extends LinearRecurrence {

  /** Construct the sequence. */
  public A302331() {
    super(new long[] {-1L, 142L}, new long[] {1L, 141L});
  } // constructor()
} // A302331
