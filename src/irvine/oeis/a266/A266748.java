package irvine.oeis.a266;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A266748 G.f.: 1/((1-t^8)*(1-t)*(1-t^3)*(1-t^5)*(1-t^7)*(1-t^9)*(1-t^11)*(1-t^13)*(1-t^15)).
 * @author Georg Fischer
 */
public class A266748 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A266748() {
    super(0, new long[] {1},
      new long[] {1, -1, 0, -1, 1, -1, 1, -1, 1, -1, 2, -1, 2, -2, 2, -3, 3, 
      -2, 2, -3, 2, -3, 2, -2, 2, -3, 2, -2, 3, -1, 2, -1, 1, 0, 
      1, 0, 0, 0, -1, 0, -1, 1, -2, 1, -3, 2, -2, 3, -2, 2, -2, 
      3, -2, 3, -2, 2, -3, 3, -2, 2, -2, 1, -2, 1, -1, 1, -1, 1, 
      -1, 1, 0, 1, -1});
  }
}
