package irvine.oeis.a029;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A029293 Expansion of 1/((1-x^3)(1-x^6)(1-x^7)(1-x^9)).
 * @author Georg Fischer
 */
public class A029293 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A029293() {
    super(0, new long[] {1},
      new long[] {1, 0, 0, -1, 0, 0, -1, -1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 
      -1, -1, 0, 0, -1, 0, 0, 1});
  }
}
