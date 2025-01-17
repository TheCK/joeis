package irvine.oeis.a123;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A123393 Values X satisfying the equation 7(X-Y)^4-2XY=0, where X&gt;=Y.
 * @author Georg Fischer
 */
public class A123393 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A123393() {
    super(0, new long[] {0, 32, -2696, 32},
      new long[] {1, -928, 26942, -928, 1});
  }
}
