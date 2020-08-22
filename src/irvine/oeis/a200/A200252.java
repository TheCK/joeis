package irvine.oeis.a200;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A200252 Number of 0..n arrays x(0..2) of 3 elements with each no smaller than the sum of its previous elements modulo (n+1).
 * @author Georg Fischer
 */
public class A200252 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A200252() {
    super(1, new long[] {0, 5, 2, -3, 1, 2, -1},
      new long[] {1, -2, -1, 4, -1, -2, 1});
  }
}
