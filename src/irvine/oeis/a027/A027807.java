package irvine.oeis.a027;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A027807 a(n) = 165*(n+1)*binomial(n+4,11)/4.
 * @author Georg Fischer
 */
public class A027807 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A027807() {
    super(7, new long[] {0, 0, 0, 0, 0, 0, 0, 330, 165},
      new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 
      13, -1});
  }
}
