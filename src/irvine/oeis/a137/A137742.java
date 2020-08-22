package irvine.oeis.a137;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A137742 a(n) = (n-1)*(n+4)*(n+6)/6 for n&gt;1, a(1)=1.
 * @author Georg Fischer
 */
public class A137742 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A137742() {
    super(1, new long[] {0, 1, 4, -5, 0, 1},
      new long[] {1, -4, 6, -4, 1});
  }
}
