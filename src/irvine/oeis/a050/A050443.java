package irvine.oeis.a050;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A050443 a(0)=4, a(1)=0, a(2)=0, a(3)=3; thereafter a(n) = a(n-3) + a(n-4). 
 * @author Georg Fischer
 */
public class A050443 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050443() {
    super(new long[] {1L, 1L, 0L, 0L}, new long[] {4L, 0L, 0L, 3L});
  } // constructor()
} // A050443
