package irvine.oeis.a081;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A081498 Consider the triangle in which the n-th row starts with n, contains n terms and the difference of successive terms is <code>1,2,3,.</code>.. up to <code>n-1</code>. Sequence gives row sums.
 * @author Georg Fischer
 */
public class A081498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081498() {
    super(new long[] {-1L, 4L, -6L, 4L}, new long[] {1L, 3L, 5L, 6L});
  } // constructor()
} // A081498
