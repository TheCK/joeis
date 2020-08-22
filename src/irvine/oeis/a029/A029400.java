package irvine.oeis.a029;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A029400 Expansion of 1/((1-x^5)(1-x^7)(1-x^10)(1-x^11)).
 * @author Georg Fischer
 */
public class A029400 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A029400() {
    super(0, new long[] {1},
      new long[] {1, 0, 0, 0, 0, -1, 0, -1, 0, 0, -1, -1, 1, 0, 0, 1, 1, 1, 
      1, 0, 0, 1, -1, -1, 0, 0, -1, 0, -1, 0, 0, 0, 0, 1});
  }
}
