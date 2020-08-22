package irvine.oeis.a072;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A072478 Surface area of n-dimensional sphere of radius r is n*V_n*r^(n-1) = n*Pi^(n/2)*r^(n-1)/(n/2)! = S_n*Pi^floor(n/2)*r^(n-1); sequence gives numerator of S_n.
 * @author Georg Fischer
 */
public class A072478 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072478() {
    super(new long[] {-2L, 0L, 3L, 0L}, new long[] {8L, 1L, 16L, 1L}, 0L, 2L, 2L, 4L, 2L);
  } // constructor()
} // A072478
