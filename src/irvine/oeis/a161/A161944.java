package irvine.oeis.a161;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A161944 a(n) = ((4+sqrt(2))*(3+sqrt(2))^n + (4-sqrt(2))*(3-sqrt(2))^n)/4. 
 * @author Georg Fischer
 */
public class A161944 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161944() {
    super(new long[] {-7L, 6L}, new long[] {2L, 7L});
  } // constructor()
} // A161944
