package irvine.oeis.a047;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A047851 a(n) = T(3,n), array T given by A047848.
 * @author Georg Fischer
 */
public class A047851 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A047851() {
    super(0, new long[] {1, -5},
      new long[] {1, -7, 6});
  }
}
