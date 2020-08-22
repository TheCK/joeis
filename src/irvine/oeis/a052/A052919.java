package irvine.oeis.a052;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A052919 a(n) = 1 + 2*3^(n-1) with a(0)=2.
 * @author Georg Fischer
 */
public class A052919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052919() {
    super(new long[] {-3L, 4L}, new long[] {3L, 7L}, 2L);
  } // constructor()
} // A052919
