package irvine.oeis.a298;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A298198 Number of Eulerian cycles in the graph Cartesian product of C_n and a double edge.
 * @author Georg Fischer
 */
public class A298198 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A298198() {
    super(1, new long[] {0, 4, -16},
      new long[] {1, -14, 60, -72});
  }
}
