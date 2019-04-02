package irvine.oeis.a133;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A133669 a(n)=a(n-1)-49*a(n-2), a(0)=1, a(1)=7 . 
 * @author Georg Fischer
 */
public class A133669 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133669() {
    super(new long[] {-49L, 1L}, new long[] {1L, 7L});
  } // constructor()
} // A133669
