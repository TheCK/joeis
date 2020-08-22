package irvine.oeis.a163;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A163450 A028403 written in base 2.
 * @author Georg Fischer
 */
public class A163450 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A163450() {
    super(1, new long[] {0, 100, -9900, 80000},
      new long[] {1, -110, 1000});
  }
}
