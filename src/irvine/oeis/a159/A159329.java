package irvine.oeis.a159;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A159329 Transform of the finite sequence (1, 0, -1) by the T_{1,1} transformation (see link).
 * @author Georg Fischer
 */
public class A159329 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A159329() {
    super(0, new long[] {-2, 2, -1, -2, 1},
      new long[] {-1, 3, -2, 1});
  }
}
