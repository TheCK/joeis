package irvine.oeis.a086;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A086970 Fix 1, then exchange the subsequent odd numbers in pairs.
 * @author Georg Fischer
 */
public class A086970 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A086970() {
    super(0, new long[] {1, 4, -3, 2},
      new long[] {1, -1, -1, 1});
  }
}
