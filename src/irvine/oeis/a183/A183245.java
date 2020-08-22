package irvine.oeis.a183;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A183245 Number of permutations of 1..2*n+2 with each element displaced by at least n.
 * @author Georg Fischer
 */
public class A183245 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A183245() {
    super(1, new long[] {0, 9, -34, 17},
      new long[] {1, -7, 12});
  }
}
