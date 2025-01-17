package irvine.oeis.a321;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A321011 Trajectory of 86 under repeated application of the map k -&gt; A320486(k^2).
 * @author Georg Fischer
 */
public class A321011 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A321011() {
    super(1, new long[] {0, 86, 7396, 547816, 12985, 805, 648025, 1325, 1762, 3106, 94723},
      new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1});
  }
}
