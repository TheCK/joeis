package irvine.oeis.a109;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A109265 Row sums of Riordan array (1-x-x^2,x(1-x)).
 * @author Georg Fischer
 */
public class A109265 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A109265() {
    super(0, new long[] {1, -1, -1},
      new long[] {1, -1, 1});
  }
}
