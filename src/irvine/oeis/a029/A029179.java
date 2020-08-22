package irvine.oeis.a029;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A029179 Expansion of 1/((1-x^2)(1-x^4)(1-x^6)(1-x^9)).
 * @author Georg Fischer
 */
public class A029179 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A029179() {
    super(0, new long[] {1},
      new long[] {1, 0, -1, 0, -1, 0, 0, 0, 1, -1, 1, 1, -1, 1, 0, 0, 0, -1, 
      0, -1, 0, 1});
  }
}
