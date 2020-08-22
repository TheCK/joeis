package irvine.oeis.a098;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A098207 a(n) is the square of near-repdigit number A033175(n).
 * @author Georg Fischer
 */
public class A098207 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A098207() {
    super(0, new long[] {-1, -850, -4000},
      new long[] {-1, 111, -1110, 1000});
  }
}
