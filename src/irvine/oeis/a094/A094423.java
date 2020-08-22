package irvine.oeis.a094;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A094423 A045873(n)^2.
 * @author Georg Fischer
 */
public class A094423 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A094423() {
    super(1, new long[] {0, 1, 5},
      new long[] {1, 1, -5, -125});
  }
}
