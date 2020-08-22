package irvine.oeis.a101;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A101502 Number of closed walks on C_5 tensor J_2.
 * @author Georg Fischer
 */
public class A101502 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A101502() {
    super(0, new long[] {1, -2, -8, 8},
      new long[] {1, -2, -12, 16});
  }
}
