package irvine.oeis.a226;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A226264 Number of additive Z_2 Z_8 codes of a certain type (see Siap-Aydogdu for precise definition).
 * @author Georg Fischer
 */
public class A226264 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A226264() {
    super(1, new long[] {0, 36, -24},
      new long[] {1, -3, 2});
  }
}
