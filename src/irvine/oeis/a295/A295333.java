package irvine.oeis.a295;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A295333 Numerators of continued fraction convergents to sqrt(10)/2 = sqrt(5/2) = A020797 + 1.
 * @author Georg Fischer
 */
public class A295333 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A295333() {
    super(0, new long[] {1, 2, 3, 2, -1, 1},
      new long[] {1, 0, 0, -6, 0, 0, -1});
  }
}
