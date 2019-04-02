package irvine.oeis.a318;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A318376 a(n) = F(n+1)^3 - 3*F(n-1)*F(n)^2, where F(n) = A000045(n), the n-th Fibonacci number. 
 * @author Georg Fischer
 */
public class A318376 extends LinearRecurrence {

  /** Construct the sequence. */
  public A318376() {
    super(new long[] {-1L, -3L, 6L, 3L}, new long[] {1L, 5L, 15L, 71L});
  } // constructor()
} // A318376
