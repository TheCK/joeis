package irvine.oeis.a047;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A047852 a(n) = T(4,n), array T given by A047848.
 * @author Georg Fischer
 */
public class A047852 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A047852() {
    super(0, new long[] {1, -6},
      new long[] {1, -8, 7});
  }
}
