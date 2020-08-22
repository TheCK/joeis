package irvine.oeis.a162;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A162769 a(n) = ((1+sqrt(5))*(4+sqrt(5))^n + (1-sqrt(5))*(4-sqrt(5))^n)/2.
 * @author Georg Fischer
 */
public class A162769 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A162769() {
    super(0, new long[] {1, 1},
      new long[] {1, -8, 11});
  }
}
