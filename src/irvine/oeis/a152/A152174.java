package irvine.oeis.a152;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A152174 a(n) = -2*a(n-1)+4*a(n-2), n&gt;1 ; a(0) = 1, a(1) = -4.
 * @author Georg Fischer
 */
public class A152174 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A152174() {
    super(0, new long[] {1, -2},
      new long[] {1, 2, -4});
  }
}
