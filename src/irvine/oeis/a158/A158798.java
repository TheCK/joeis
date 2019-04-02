package irvine.oeis.a158;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A158798 a(n)=a(n-1)+64*a(n-2), a(0)=1, a(1)=8. 
 * @author Georg Fischer
 */
public class A158798 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158798() {
    super(new long[] {64L, 1L}, new long[] {1L, 8L});
  } // constructor()
} // A158798
