package irvine.oeis.a266;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A266744 G.f.: 1/((1-t^4)*(1-t)*(1-t^3)*(1-t^5)*(1-t^7)).
 * @author Georg Fischer
 */
public class A266744 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A266744() {
    super(0, new long[] {1},
      new long[] {1, -1, 0, -1, 0, 0, 1, 0, 1, 0, 0, 0, -1, 0, -1, 0, 0, 1, 
      0, 1, -1});
  }
}
