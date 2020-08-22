package irvine.oeis.a067;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A067977 Convolution of Fibonacci F(n+1), n&gt;=0, with F(n+9), n&gt;=0.
 * @author Georg Fischer
 */
public class A067977 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A067977() {
    super(0, new long[] {34, 21},
      new long[] {1, -2, -1, 2, 1});
  }
}
