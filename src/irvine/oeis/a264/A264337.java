package irvine.oeis.a264;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A264337 Number of (n+1) X (4+1) arrays of permutations of 0..n*5+4 with each element having index change +-(.,.) 0,0 0,1 or 1,2.
 * @author Georg Fischer
 */
public class A264337 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A264337() {
    super(1, new long[] {0, 181, 128},
      new long[] {1, -19, -16});
  }
}
