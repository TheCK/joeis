package irvine.oeis.a055;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A055856 Susceptibility series H_4 for 2-dimensional Ising model (divided by 2).
 * @author Georg Fischer
 */
public class A055856 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A055856() {
    super(0, new long[] {1, 15, 71, 192, 326, 388, 326, 192, 71, 15, 1},
      new long[] {1, -1, -3, 2, 4, 0, -4, -2, 3, 1, -1});
  }
}
