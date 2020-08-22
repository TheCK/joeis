package irvine.oeis.a027;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A027010 a(n) = Sum_{k=floor((n+1)/2)..n} T(k,n-k); i.e., a(n) is the n-th diagonal sum of left-justified array T given by A026998.
 * @author Georg Fischer
 */
public class A027010 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A027010() {
    super(1, new long[] {0, 1, 0, -1, 2},
      new long[] {1, -1, -2, 1, 2, -1});
  }
}
