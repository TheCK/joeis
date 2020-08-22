package irvine.oeis.a073;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A073371 Convolution of A001045(n+1) (generalized (1,2)-Fibonacci), n&gt;=0 with itself.
 * @author Georg Fischer
 */
public class A073371 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A073371() {
    super(0, new long[] {1},
      new long[] {1, -2, -3, 4, 4});
  }
}
