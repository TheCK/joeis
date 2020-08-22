package irvine.oeis.a111;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A111914 Expansion of -x^2*(x^4-2*x^3+x^2-2*x+1)*(x+1)^2 / ((x-1)*(x^8-x^4+1)).
 * @author Georg Fischer
 */
public class A111914 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A111914() {
    super(0, new long[] {0, 0, -1, 0, 2, 2, 2, 0, -1},
      new long[] {-1, 1, 0, 0, 1, -1, 0, 0, -1, 1});
  }
}
