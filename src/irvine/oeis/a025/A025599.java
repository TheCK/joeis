package irvine.oeis.a025;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A025599 Number of n-move knight paths on 8 X 8 board from given corner to any square.
 * @author Georg Fischer
 */
public class A025599 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A025599() {
    super(0, new long[] {1, -1, -21, 3, 108, 42, -128, -72},
      new long[] {1, -3, -27, 29, 162, -42, -276, -16, 96});
  }
}
