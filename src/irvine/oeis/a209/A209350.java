package irvine.oeis.a209;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A209350 Number of initially rising meander words, where each letter of the cyclic n-ary alphabet occurs twice.
 * @author Georg Fischer
 */
public class A209350 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A209350() {
    super(0, new long[] {-1, 2, -1, -5, 2, 5, -3},
      new long[] {-1, 2, 0, -2, 1});
  }
}
