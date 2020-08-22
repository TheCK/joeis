package irvine.oeis.a282;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A282641 Number of nX2 0..1 arrays with no 1 equal to more than one of its king-move neighbors.
 * @author Georg Fischer
 */
public class A282641 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A282641() {
    super(1, new long[] {0, -4, -7, -4},
      new long[] {-1, 1, 3, 4});
  }
}
