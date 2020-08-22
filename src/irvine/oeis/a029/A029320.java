package irvine.oeis.a029;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A029320 Expansion of 1/((1-x^3)(1-x^8)(1-x^10)(1-x^12)).
 * @author Georg Fischer
 */
public class A029320 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A029320() {
    super(0, new long[] {1},
      new long[] {1, 0, 0, -1, 0, 0, 0, 0, -1, 0, -1, 1, -1, 1, 0, 1, 0, 0, 
      1, 0, 1, -1, 1, -1, 0, -1, 0, 0, 0, 0, -1, 0, 0, 1});
  }
}
