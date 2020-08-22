package irvine.oeis.a268;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A268459 Number of length-5 0..n arrays with no adjacent pair x,x+1 followed at any distance by x+1,x.
 * @author Georg Fischer
 */
public class A268459 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A268459() {
    super(1, new long[] {0, 16, 80, 36, -16, 4},
      new long[] {1, -6, 15, -20, 15, -6, 1});
  }
}
