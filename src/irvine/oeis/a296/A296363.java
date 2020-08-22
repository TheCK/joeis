package irvine.oeis.a296;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A296363 a(1)=0; for n&gt;1, a(n) = 4*n^3 - 3*n^2 - 3*n + 4.
 * @author Georg Fischer
 */
public class A296363 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A296363() {
    super(1, new long[] {0, 0, 18, 4, 4, -2},
      new long[] {1, -4, 6, -4, 1});
  }
}
