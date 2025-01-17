package irvine.oeis.a068;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A068930 Number of incongruent ways to tile a 5 X 2n room with 1x2 Tatami mats. At most 3 Tatami mats may meet at a point.
 * @author Georg Fischer
 */
public class A068930 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A068930() {
    super(1, new long[] {0, 4, 2, -3, -5, -6, -2, -1, 3, 4, 5, 1},
      new long[] {1, 0, -1, -1, -1, 0, 0, 1, 1, 1});
  }
}
