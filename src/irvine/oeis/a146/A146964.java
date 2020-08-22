package irvine.oeis.a146;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A146964 a(n) = ((4 + sqrt(7))^n + (4 - sqrt(7))^n))/2.
 * @author Georg Fischer
 */
public class A146964 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A146964() {
    super(0, new long[] {1, -4},
      new long[] {1, -8, 9});
  }
}
