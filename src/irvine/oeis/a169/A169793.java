package irvine.oeis.a169;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A169793 Expansion of ((1-x)/(1-2*x))^6.
 * @author Georg Fischer
 */
public class A169793 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A169793() {
    super(0, new long[] {1, -6, 15, -20, 15, -6, 1},
      new long[] {1, -12, 60, -160, 240, -192, 64});
  }
}
