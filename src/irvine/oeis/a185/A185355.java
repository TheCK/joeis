package irvine.oeis.a185;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A185355 Number of n X n symmetric (0,1)-matrices containing four ones.
 * @author Georg Fischer
 */
public class A185355 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A185355() {
    super(1, new long[] {0, 0, 1, 7, 2},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
