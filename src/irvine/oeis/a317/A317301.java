package irvine.oeis.a317;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A317301 Sequence obtained by taking the general formula for generalized k-gonal numbers: m*((k - 2)*m - k + 4)/2, where m = 0, +1, -1, +2, -2, +3, -3, ... and k &gt;= 5. Here k = 1.
 * @author Georg Fischer
 */
public class A317301 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A317301() {
    super(0, new long[] {0, 1, -3, 1},
      new long[] {1, -1, -2, 2, 1, -1});
  }
}
