package irvine.oeis.a253;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A253671 a(n) = floor(A000111(n+1)/A000111(n)).
 * @author Georg Fischer
 */
public class A253671 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A253671() {
    super(1, new long[] {0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, -1, 1, -1, 1},
      new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1});
  }
}
