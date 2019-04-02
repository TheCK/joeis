package irvine.oeis.a080;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A080458 a(1)=4; for n&gt;1, a(n)=a(n-1) if n is already in the sequence, a(n)=a(n-1)+4 otherwise. 
 * @author Georg Fischer
 */
public class A080458 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080458() {
    super(new long[] {-1L, 1L, 0L, 0L, 1L}, new long[] {4L, 8L, 12L, 12L, 16L});
  } // constructor()
} // A080458
