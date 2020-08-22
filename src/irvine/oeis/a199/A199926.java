package irvine.oeis.a199;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A199926 Number of sequences of n coin flips that win on the last flip, if the sequence of flips ends with (1,1,1,1).
 * @author Georg Fischer
 */
public class A199926 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A199926() {
    super(1, new long[] {0, 0, 0, 0, 1, 0, -1, -1},
      new long[] {1, -1, -1, -1, 0, 1});
  }
}
