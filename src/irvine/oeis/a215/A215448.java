package irvine.oeis.a215;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A215448 a(0)=1, a(1)=0, a(n) = a(n-1) + a(n-2) + Sum_{i=0...n-1} a(i). 
 * @author Georg Fischer
 */
public class A215448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215448() {
    super(new long[] {-1L, 0L, 3L}, new long[] {1L, 0L, 2L});
  } // constructor()
} // A215448
