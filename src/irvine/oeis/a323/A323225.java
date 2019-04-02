package irvine.oeis.a323;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A323225 a(n) = ((2^n*n + i*(1 - i)^n - i*(1 + i)^n))/4, where i is the imaginary unit. 
 * @author Georg Fischer
 */
public class A323225 extends LinearRecurrence {

  /** Construct the sequence. */
  public A323225() {
    super(new long[] {-8L, 16L, -14L, 6L}, new long[] {0L, 1L, 3L, 7L});
  } // constructor()
} // A323225
