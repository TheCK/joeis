package irvine.oeis.a305;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A305889 a(n) = 3*a(n-2) + a(n-4), a(0)=a(1)=0, a(2)=1, a(3)=2. 
 * @author Georg Fischer
 */
public class A305889 extends LinearRecurrence {

  /** Construct the sequence. */
  public A305889() {
    super(new long[] {1L, 0L, 3L, 0L}, new long[] {0L, 0L, 1L, 2L});
  } // constructor()
} // A305889
