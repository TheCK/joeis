package irvine.oeis.a135;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A135849 a(n) is the ratio of the sum of the bends (curvatures) of the circles in the n-th generation of an Apollonian packing to the sum of the bends in the initial four-circle configuration.
 * @author Georg Fischer
 */
public class A135849 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A135849() {
    super(1, new long[] {0, 243, -729, 486},
      new long[] {243, -1944, 729});
  }
}
