package irvine.oeis.a251;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A251293 Number of (n+1) X (1+1) 0..3 arrays with every 2 X 2 subblock summing to 3 6 or 9.
 * @author Georg Fischer
 */
public class A251293 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A251293() {
    super(1, new long[] {0, 84, -396, -320},
      new long[] {1, -10, 21, 20});
  }
}
