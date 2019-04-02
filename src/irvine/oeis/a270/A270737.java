package irvine.oeis.a270;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A270737 a(n) = ((n+2)/2)*Sum_{k=0..n/2} (Sum_{i=0..n-2*k} (binomial(k+1,n-2*k-i)*binomial(k+i,k))*F(k+1)/(k+1)), where F(k) is Fibonacci numbers. 
 * @author Georg Fischer
 */
public class A270737 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270737() {
    super(new long[] {1L, 2L, 0L, 0L, 0L, 2L}, new long[] {1L, 3L, 5L, 10L, 20L, 42L});
  } // constructor()
} // A270737
