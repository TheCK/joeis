package irvine.oeis.a297;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A297182 a(n) is the smallest positive integer of length (distance from origin) n in the Cayley graph of the integers generated by all powers of 13.
 * @author Georg Fischer
 */
public class A297182 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A297182() {
    super(1, new long[] {0, 1, 1, 1, 1, 1, 1, -12},
      new long[] {1, -1, 0, 0, 0, 0, -13, 13});
  }
}
