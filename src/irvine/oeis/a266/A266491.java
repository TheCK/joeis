package irvine.oeis.a266;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A266491 a(n) = n*A130658(n).
 * @author Georg Fischer
 */
public class A266491 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A266491() {
    super(0, new long[] {0, 2, 4, 6, 8, 10, 4, 10, 0, 4},
      new long[] {2, -4, 10, -16, 20, -24, 20, -16, 10, -4, 2});
  }
}
