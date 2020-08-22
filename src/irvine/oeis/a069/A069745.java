package irvine.oeis.a069;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A069745 Expansion of 1/((1-x^2)(1-x^3)(1-x^6)(1-x^7)(1-x^8)).
 * @author Georg Fischer
 */
public class A069745 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A069745() {
    super(0, new long[] {1},
      new long[] {1, 0, -1, -1, 0, 1, -1, -1, 0, 2, 2, 0, -1, 0, 1, 0, -2, 
      -2, 0, 1, 1, -1, 0, 1, 1, 0, -1});
  }
}
