package irvine.oeis.a052;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A052993 a(n) = a(n-1) + 3*a(n-2) - 3*a(n-3), with a(0)=a(1)=1, a(2)=4. 
 * @author Georg Fischer
 */
public class A052993 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052993() {
    super(new long[] {-3L, 3L, 1L}, new long[] {1L, 1L, 4L});
  } // constructor()
} // A052993
