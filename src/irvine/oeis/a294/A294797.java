package irvine.oeis.a294;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A294797 Permutations of [n] avoiding {1243,1324,3412}.
 * @author Georg Fischer
 */
public class A294797 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A294797() {
    super(0, new long[] {1, -12, 63, -189, 358, -447, 367, -192, 64, -10},
      new long[] {1, -13, 74, -243, 510, -715, 678, -429, 173, -40, 4});
  }
}
