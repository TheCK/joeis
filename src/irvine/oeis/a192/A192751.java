package irvine.oeis.a192;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A192751 Define a pair of sequences c_n, d_n by c_0=0, d_0=1 and thereafter c_n = c_{n-1}+d_{n-1}, d_n = c_{n-1}+4*n+2; sequence here is c_n.
 * @author Georg Fischer
 */
public class A192751 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A192751() {
    super(0, new long[] {0, -1, -4, 1},
      new long[] {-1, 3, -2, -1, 1});
  }
}
