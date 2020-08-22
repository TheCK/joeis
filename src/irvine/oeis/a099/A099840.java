package irvine.oeis.a099;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A099840 Expansion of (1-6*x)/(1-20*x^2).
 * @author Georg Fischer
 */
public class A099840 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A099840() {
    super(0, new long[] {1, -6},
      new long[] {1, 0, -20});
  }
}
