package irvine.oeis.a117;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A117662 n*(n-1)*(n-2)*(n+3)/12.
 * @author Georg Fischer
 */
public class A117662 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A117662() {
    super(0, new long[] {0, 0, 0, 3, -1},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
