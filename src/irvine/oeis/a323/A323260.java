package irvine.oeis.a323;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A323260 Number of horizontally convex polyoctagons containing n regular polygons (squares or octagons).
 * @author Georg Fischer
 */
public class A323260 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A323260() {
    super(0, new long[] {0, 2, -4, 0, 4, -2},
      new long[] {1, -5, 3, 5, -7, 1});
  }
}
