package irvine.oeis.a262;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A262699 List of currency denominations such that any value x &gt; 0 is represented in exactly x ways as a sum of distinct denominations, where a repeated value represents a bill and a coin which count as distinct denominations.
 * @author Georg Fischer
 */
public class A262699 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A262699() {
    super(1, new long[] {0, 1, 2, 0, -1, 0, -2},
      new long[] {1, 0, -2});
  }
}
