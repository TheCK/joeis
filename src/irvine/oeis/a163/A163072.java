package irvine.oeis.a163;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A163072 a(n) = ((4+sqrt(5))*(5+sqrt(5))^n + (4-sqrt(5))*(5-sqrt(5))^n)/2. 
 * @author Georg Fischer
 */
public class A163072 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163072() {
    super(new long[] {-20L, 10L}, new long[] {4L, 25L});
  } // constructor()
} // A163072
