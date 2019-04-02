package irvine.oeis.a122;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A122876 a(0)=1, a(1)=1, a(2)=2, a(n) = a(n-1) - a(n-2) for n&gt;2. 
 * @author Georg Fischer
 */
public class A122876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122876() {
    super(new long[] {-1L, 1L}, new long[] {1L, 1L});
  } // constructor()
} // A122876
