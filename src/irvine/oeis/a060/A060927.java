package irvine.oeis.a060;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A060927 Row sums of triangle A060924 (odd part of bisection of Lucas triangle).
 * @author Georg Fischer
 */
public class A060927 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A060927() {
    super(0, new long[] {3, -2},
      new long[] {1, -5, 0, -4});
  }
}
