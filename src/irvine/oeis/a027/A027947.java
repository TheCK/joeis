package irvine.oeis.a027;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A027947 a(n) = Sum_{k=m..n} T(k,n-k), where m = floor((n+1)/2); a(n) is the n-th diagonal-sum of left justified array T given by A027935.
 * @author Georg Fischer
 */
public class A027947 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A027947() {
    super(0, new long[] {1, 1},
      new long[] {1, 0, -2, -1, 1});
  }
}
