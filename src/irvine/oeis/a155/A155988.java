package irvine.oeis.a155;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A155988 a(n) = (2*n+1)*9^n.
 * @author Georg Fischer
 */
public class A155988 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A155988() {
    super(0, new long[] {1, 9},
      new long[] {1, -18, 81});
  }
}
