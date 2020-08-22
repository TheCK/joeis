package irvine.oeis.a083;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A083321 a(n) = (-1)^n + (-2)^n - (-3)^n.
 * @author Georg Fischer
 */
public class A083321 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A083321() {
    super(0, new long[] {1, 6, 7},
      new long[] {1, 6, 11, 6});
  }
}
