package irvine.oeis.a229;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A229279 Number of ascending runs in {1,...,5}^n.
 * @author Georg Fischer
 */
public class A229279 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A229279() {
    super(0, new long[] {0, 5, -10},
      new long[] {1, -10, 25});
  }
}
