package irvine.oeis.a126;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A126972 Number of distinct values taken by the entropy for permutations of [1..n], where the entropy of a permutation pi is Sum_{k=1..n} (pi(k)-k)^2.
 * @author Georg Fischer
 */
public class A126972 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126972() {
    super(new long[] {-1L, 4L, -6L, 4L}, new long[] {11L, 21L, 36L, 57L}, 1, 1L, 2L, 4L);
  } // constructor()
} // A126972
