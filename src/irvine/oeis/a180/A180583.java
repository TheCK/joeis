package irvine.oeis.a180;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A180583 Number of Hamiltonian cycles in C_7 X P_n.
 * @author Georg Fischer
 */
public class A180583 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A180583() {
    super(1, new long[] {0, 1, -5, 24, -42, -400, -474, 700, 1996, 588, -192, 8, -16, 
      16},
      new long[] {1, -12, -18, 112, 440, 772, 196, -2064, -3724, -2040, -496, -128, 
      16});
  }
}
