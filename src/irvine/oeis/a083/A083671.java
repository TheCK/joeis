package irvine.oeis.a083;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A083671 Array read by rows in which each row describes in words the composition of the previous row.
 * @author Georg Fischer
 */
public class A083671 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A083671() {
    super(1, new long[] {0, -1, -1, -1, -2, -1, -1, -1, -1, -1, -2, 0, 1, -1, -1, 0, 
      0, 0, 2, -2, -2, 1, 0, -1, 0, -1, -1, 2, 1, -1, 0, -1, 0, 
      2, -2, -1, 1, -1, -1, 2, 0, -1, 3, -1, 0, -1, -1, 0, 0, 0, 
      -1, 0, 0, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, -1, 0, 
      1},
      new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 1});
  }
}
