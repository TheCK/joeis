package irvine.oeis.a026;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A026644 a(n) = a(n-1) + 2*a(n-2) + 2, for n&gt;=3, where a(0)= 1, a(1)= 2, a(2)= 4.
 * @author Georg Fischer
 */
public class A026644 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A026644() {
    super(0, new long[] {1, 0, -1, 2},
      new long[] {1, -2, -1, 2});
  }
}
