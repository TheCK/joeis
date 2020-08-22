package irvine.oeis.a212;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A212587 Walks of length n on the x-axis using steps {1,0,-1} and visiting no point more than twice.
 * @author Georg Fischer
 */
public class A212587 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A212587() {
    super(0, new long[] {-1, -2, -2, -2, 2, -2, -2, -2, 3},
      new long[] {-1, 2, 2, -4, 0, 2, -2, 0, 1});
  }
}
