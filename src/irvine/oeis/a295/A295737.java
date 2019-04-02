package irvine.oeis.a295;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A295737 a(n) = a(n-1) + 3*a(n-2) -2*a(n-3) - 2*a(n-4), where a(0) = 1, a(1) = -1, a(2) = -1, a(3) = 2. 
 * @author Georg Fischer
 */
public class A295737 extends LinearRecurrence {

  /** Construct the sequence. */
  public A295737() {
    super(new long[] {-2L, -2L, 3L, 1L}, new long[] {1L, -1L, -1L, 2L});
  } // constructor()
} // A295737
