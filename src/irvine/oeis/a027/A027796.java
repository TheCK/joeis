package irvine.oeis.a027;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A027796 a(n) = 55*(n+1)*binomial(n+3,11)/3.
 * @author Georg Fischer
 */
public class A027796 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A027796() {
    super(8, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 165, 55},
      new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 
      13, -1});
  }
}
