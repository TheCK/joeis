package irvine.oeis.a319;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A319170 Triangular numbers of the form 2..21..1; n_times 2 followed with n_times 1; n &gt;= 1.
 * @author Georg Fischer
 */
public class A319170 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A319170() {
    super(1, new long[] {0, 21, -120},
      new long[] {1, -111, 1110, -1000});
  }
}
