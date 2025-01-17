package irvine.oeis.a183;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A183124 Magnetic Tower of Hanoi, number of moves of disk number n, generated by a certain algorithm, yielding a "forward moving" non-optimal solution of the [NEUTRAL ; NEUTRAL ; NEUTRAL] pre-colored puzzle.
 * @author Georg Fischer
 */
public class A183124 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A183124() {
    super(0, new long[] {0, 1, -1, -3, 1, 0, -2, 0, -4},
      new long[] {1, -4, 2, 4, -3});
  }
}
