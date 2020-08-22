package irvine.oeis.a267;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A267467 Number of length-n 0..4 arrays with no following elements larger than the first repeated value.
 * @author Georg Fischer
 */
public class A267467 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A267467() {
    super(1, new long[] {0, 5, -70, 365, -870, 920, -326},
      new long[] {1, -19, 145, -565, 1174, -1216, 480});
  }
}
