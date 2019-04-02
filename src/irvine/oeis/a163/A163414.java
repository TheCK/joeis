package irvine.oeis.a163;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A163414 a(n) = 16*a(n-1) - 62*a(n-2) for n&gt;1, a(0)=1, a(1)=12. 
 * @author Georg Fischer
 */
public class A163414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163414() {
    super(new long[] {-62L, 16L}, new long[] {1L, 12L});
  } // constructor()
} // A163414
