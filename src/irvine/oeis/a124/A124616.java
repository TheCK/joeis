package irvine.oeis.a124;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A124616 Poincar\u00e9 series [or Poincare series] P(T_{4,2}; x).
 * @author Georg Fischer
 */
public class A124616 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A124616() {
    super(0, new long[] {1, -1, 0, 1, 0, 1, 0, -1, 1},
      new long[] {1, -5, 6, 5, -7, -6, -22, 44, 21, -13, -40, -93, 94, 79, 72, 
      -81, -228, 45, 84, 225, 0, -225, -84, -45, 228, 81, -72, -79, 
      -94, 93, 40, 13, -21, -44, 22, 6, 7, -5, -6, 5, -1});
  }
}
