package irvine.oeis.a156;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A156550 5*(-1)^n*A078008(n).
 * @author Georg Fischer
 */
public class A156550 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A156550() {
    super(0, new long[] {5, 5},
      new long[] {1, 1, -2});
  }
}
