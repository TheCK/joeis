package irvine.oeis.a179;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A179207 a(n) = n - 1 + ceiling((-3 + n^2)/2) if n &gt; 1 with a(1)=1, complement of A182835.
 * @author Georg Fischer
 */
public class A179207 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A179207() {
    super(1, new long[] {0, 1, 0, 1, 2, -2},
      new long[] {1, -2, 0, 2, -1});
  }
}
