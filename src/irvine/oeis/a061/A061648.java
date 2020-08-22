package irvine.oeis.a061;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A061648 Area of all nondecreasing Dyck paths of length 2n.
 * @author Georg Fischer
 */
public class A061648 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A061648() {
    super(1, new long[] {0, 1, -4, 8, -9, 0, 2},
      new long[] {1, -10, 39, -75, 75, -39, 10, -1});
  }
}
