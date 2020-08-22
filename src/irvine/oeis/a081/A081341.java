package irvine.oeis.a081;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A081341 Expansion of exp(3*x)*cosh(3*x).
 * @author Georg Fischer
 */
public class A081341 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A081341() {
    super(0, new long[] {1, -3},
      new long[] {1, -6});
  }
}
