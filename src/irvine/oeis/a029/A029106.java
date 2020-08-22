package irvine.oeis.a029;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A029106 Expansion of 1/((1-x)(1-x^6)(1-x^7)(1-x^8)).
 * @author Georg Fischer
 */
public class A029106 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A029106() {
    super(0, new long[] {1},
      new long[] {1, -1, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 1, 0, 0, -1, 0, 
      0, 0, 0, -1, 1});
  }
}
