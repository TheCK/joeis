package irvine.oeis.a211;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A211439 Number of ordered triples (w,x,y) with all terms in {-n,...,0,...,n} and w+3x+3y=0.
 * @author Georg Fischer
 */
public class A211439 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A211439() {
    super(0, new long[] {1, 2, 2, 12, 2, 2, 1},
      new long[] {1, -1, 0, -2, 2, 0, 1, -1});
  }
}
