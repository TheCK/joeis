package irvine.oeis.a270;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A270572 a(1)=3; thereafter a(n) is the number of occurrences of a(n-1) in {a(1), ... , a(n-1)}.
 * @author Georg Fischer
 */
public class A270572 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A270572() {
    super(1, new long[] {0, 3, 1, -2, 1, 0, 1, -2, -2, 3, 0, 1, -3, -1, 2, -1},
      new long[] {1, 0, -1, 0, 0, 0, -1, 0, 1});
  }
}
