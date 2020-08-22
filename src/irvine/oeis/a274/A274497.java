package irvine.oeis.a274;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A274497 Sum of the degrees of asymmetry of all binary words of length n.
 * @author Georg Fischer
 */
public class A274497 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A274497() {
    super(0, new long[] {0, 0, 2},
      new long[] {1, -2, -4, 8});
  }
}
