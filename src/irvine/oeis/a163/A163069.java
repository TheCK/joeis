package irvine.oeis.a163;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A163069 a(n) = ((4+sqrt(5))*(1+sqrt(5))^n + (4-sqrt(5))*(1-sqrt(5))^n)/2. 
 * @author Georg Fischer
 */
public class A163069 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163069() {
    super(new long[] {4L, 2L}, new long[] {4L, 9L});
  } // constructor()
} // A163069
