package irvine.oeis.a316;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A316937 a(n) = 3*a(n-1) - a(n-2) - 2*a(n-3) for n &gt; 2, a(0)=3, a(1)=10, a(2)=26. 
 * @author Georg Fischer
 */
public class A316937 extends LinearRecurrence {

  /** Construct the sequence. */
  public A316937() {
    super(new long[] {-2L, -1L, 3L}, new long[] {3L, 10L, 26L});
  } // constructor()
} // A316937
