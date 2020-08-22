package irvine.oeis.a027;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A027794 a(n) = 12*(n+1)*C(n+3,9).
 * @author Georg Fischer
 */
public class A027794 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A027794() {
    super(6, new long[] {0, 0, 0, 0, 0, 0, 84, 36},
      new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11, -1});
  }
}
