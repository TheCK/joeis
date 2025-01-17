package irvine.oeis.a026;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A026390 Expansion of (2 + x + x^2)/((1 - x)*(1 - x - x^2)).
 * @author Georg Fischer
 */
public class A026390 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A026390() {
    super(0, new long[] {2, 1, 1},
      new long[] {1, -2, 0, 1});
  }
}
