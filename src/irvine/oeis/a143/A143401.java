package irvine.oeis.a143;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A143401 Expansion of x^k/Product_{t=k..2k} (1-tx) for k=6.
 * @author Georg Fischer
 */
public class A143401 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A143401() {
    super(0, new long[] {0, 0, 0, 0, 0, 0, 1},
      new long[] {1, -63, 1687, -24885, 218344, -1139292, 3272688, -3991680});
  }
}
