package irvine.oeis.a190;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A190943 a(n) = 8*a(n-1) + 27*a(n-2), with a(0)=0, a(1)=1.
 * @author Georg Fischer
 */
public class A190943 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A190943() {
    super(0, new long[] {0, 1},
      new long[] {1, -8, -27});
  }
}
