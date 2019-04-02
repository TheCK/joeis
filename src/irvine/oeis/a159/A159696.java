package irvine.oeis.a159;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A159696 a(0)=8, a(n) = 2*a(n-1) + 2^(n-1) for n &gt; 0. 
 * @author Georg Fischer
 */
public class A159696 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159696() {
    super(new long[] {-4L, 4L}, new long[] {8L, 17L});
  } // constructor()
} // A159696
