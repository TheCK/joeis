package irvine.oeis.a117;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A117465 Denominator of -16/((n+2)*n*(n-2)*(n-4)).
 * @author Georg Fischer
 */
public class A117465 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A117465() {
    super(1, new long[] {0, -9, 0, 30, 0, -120, -24, -480, 0, 315, 0, -150, 0, 30},
      new long[] {-1, 0, 5, 0, -10, 0, 10, 0, -5, 0, 1});
  }
}
