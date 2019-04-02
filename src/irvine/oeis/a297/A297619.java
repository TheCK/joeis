package irvine.oeis.a297;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A297619 a(n) = 2*a(n-1) + 2*a(n-2) - 4*a(n-3), a(1) = 0, a(2) = 0, a(3) = 8. 
 * @author Georg Fischer
 */
public class A297619 extends LinearRecurrence {

  /** Construct the sequence. */
  public A297619() {
    super(new long[] {-4L, 2L, 2L}, new long[] {0L, 0L, 8L});
  } // constructor()
} // A297619
