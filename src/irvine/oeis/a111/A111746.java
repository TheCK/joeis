package irvine.oeis.a111;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A111746 Number of squares in the interior of the square with vertices (n,0), (0,n), (-n,0) and (0,-n) in a square (x,y)-grid.
 * @author Georg Fischer
 */
public class A111746 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A111746() {
    super(0, new long[] {0, 5, 2, 1},
      new long[] {1, -3, 2, 2, -3, 1});
  }
}
