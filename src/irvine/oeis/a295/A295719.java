package irvine.oeis.a295;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A295719 a(n) = a(n-1) + 3*a(n-2) -2*a(n-3) - 2*a(n-4), where a(0) = 1, a(1) = 3, a(2) = 6, a(3) = 10. 
 * @author Georg Fischer
 */
public class A295719 extends LinearRecurrence {

  /** Construct the sequence. */
  public A295719() {
    super(new long[] {-2L, -2L, 3L, 1L}, new long[] {1L, 3L, 6L, 10L});
  } // constructor()
} // A295719
