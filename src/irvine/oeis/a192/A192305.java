package irvine.oeis.a192;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A192305 0-sequence of reduction of (2n) by x^2 -&gt; x+1.
 * @author Georg Fischer
 */
public class A192305 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A192305() {
    super(1, new long[] {0, 2, -4, 4},
      new long[] {1, -3, 1, 3, -1, -1});
  }
}
