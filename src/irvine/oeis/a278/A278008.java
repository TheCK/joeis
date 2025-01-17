package irvine.oeis.a278;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A278008 Number of n X 2 0..2 arrays with every element plus 1 mod 3 equal to some element at offset (-1,-1) (-1,0) (-1,1) (0,-1) (0,1) or (1,0), with upper left element zero.
 * @author Georg Fischer
 */
public class A278008 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A278008() {
    super(1, new long[] {0, 0, 6},
      new long[] {1, -5, -8});
  }
}
