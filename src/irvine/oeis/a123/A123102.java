package irvine.oeis.a123;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A123102 a(0)=1, a(1)=0, a(2)=1, a(n)=a(n-1)+a(n-2)+3*a(n-3). 
 * @author Georg Fischer
 */
public class A123102 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123102() {
    super(new long[] {3L, 1L, 1L}, new long[] {1L, 0L, 1L});
  } // constructor()
} // A123102
