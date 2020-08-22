package irvine.oeis.a086;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A086163 Number of monomial ideals in two variables x, y that are Artinian, integrally closed, of colength n and contain x^4.
 * @author Georg Fischer
 */
public class A086163 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A086163() {
    super(0, new long[] {1, 0, 1, 0, 1, 1, -1, -1, 0, 2, -2, -1, -2, 2, -1, -1, 1, 
      1, 1, -1},
      new long[] {1, -1, 0, -1, 1, 0, -1, 1, 0, 1, -2, 1, 0, 1, -1, 0, 1, -1, 
      0, -1, 1});
  }
}
