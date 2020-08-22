package irvine.oeis.a103;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A103461 a(n) = (-10)^n + 1 - 0^n.
 * @author Georg Fischer
 */
public class A103461 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A103461() {
    super(0, new long[] {1, 0, 10},
      new long[] {1, 9, -10});
  }
}
