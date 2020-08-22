package irvine.oeis.a274;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A274271 Number of partitions of 3^n into at most four parts.
 * @author Georg Fischer
 */
public class A274271 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A274271() {
    super(0, new long[] {1, -37, 288, -405, -81},
      new long[] {1, -40, 390, -1080, 729});
  }
}
