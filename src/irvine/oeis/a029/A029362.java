package irvine.oeis.a029;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A029362 Expansion of 1/((1-x^4)(1-x^7)(1-x^8)(1-x^12)).
 * @author Georg Fischer
 */
public class A029362 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A029362() {
    super(0, new long[] {1},
      new long[] {1, 0, 0, 0, -1, 0, 0, -1, -1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 
      0, 0, 1, 0, 0, -1, -1, 0, 0, -1, 0, 0, 0, 1});
  }
}
