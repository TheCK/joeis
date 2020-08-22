package irvine.oeis.a270;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A270472 Expansion of (1-2*x)/(1-9*x).
 * @author Georg Fischer
 */
public class A270472 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A270472() {
    super(0, new long[] {1, -2},
      new long[] {1, -9});
  }
}
