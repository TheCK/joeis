package irvine.oeis.a134;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A134202 Number of rigid Hv-groups of order n.
 * @author Georg Fischer
 */
public class A134202 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A134202() {
    super(1, new long[] {0, -1, -4, -8, -1},
      new long[] {-1, 1});
  }
}
