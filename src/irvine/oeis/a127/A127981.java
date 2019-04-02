package irvine.oeis.a127;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A127981 a(n) = (n + 1/3)*2^(n-1) - 1/2 + (-1)^(n-1)*(1/6). 
 * @author Georg Fischer
 */
public class A127981 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127981() {
    super(new long[] {4L, -4L, -3L, 4L}, new long[] {1L, 4L, 13L, 34L});
  } // constructor()
} // A127981
