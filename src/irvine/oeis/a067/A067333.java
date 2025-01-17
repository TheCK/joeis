package irvine.oeis.a067;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A067333 Convolution of Fibonacci F(n+1), n&gt;=0, with F(n+5), n&gt;=0.
 * @author Georg Fischer
 */
public class A067333 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A067333() {
    super(0, new long[] {5, 3},
      new long[] {1, -2, -1, 2, 1});
  }
}
