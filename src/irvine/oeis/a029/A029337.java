package irvine.oeis.a029;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A029337 Expansion of 1/((1-x^4)(1-x^5)(1-x^8)(1-x^9)).
 * @author Georg Fischer
 */
public class A029337 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A029337() {
    super(0, new long[] {1},
      new long[] {1, 0, 0, 0, -1, -1, 0, 0, -1, 0, 0, 0, 1, 2, 1, 0, 0, 0, 
      -1, 0, 0, -1, -1, 0, 0, 0, 1});
  }
}
