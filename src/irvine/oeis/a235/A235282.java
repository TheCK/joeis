package irvine.oeis.a235;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A235282 Number of (n+1) X (1+1) 0..3 arrays with every 2 X 2 subblock having its diagonal sum differing from its antidiagonal sum by 4 (constant stress 1 X 1 tilings).
 * @author Georg Fischer
 */
public class A235282 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A235282() {
    super(1, new long[] {0, 20, 0, -72},
      new long[] {1, -2, -3, 6});
  }
}
