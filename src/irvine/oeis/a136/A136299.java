package irvine.oeis.a136;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A136299 a(n)=3a(n-1)-4a(n-3), n&gt;3.
 * @author Georg Fischer
 */
public class A136299 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A136299() {
    super(0, new long[] {1, -1, -2, -1},
      new long[] {1, -3, 0, 4});
  }
}
