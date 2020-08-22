package irvine.oeis.a266;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A266751 G.f.: 1/((1-t^11)^2*(1-t)*(1-t^3)*(1-t^5)*(1-t^7)*(1-t^9)*(1-t^13)*(1-t^15)*(1-t^17)*(1-t^19)*(1-t^21)).
 * @author Georg Fischer
 */
public class A266751 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A266751() {
    super(0, new long[] {1},
      new long[] {1, -1, 0, -1, 1, -1, 1, -1, 2, -2, 2, -3, 4, -3, 4, -5, 6, 
      -6, 6, -8, 9, -10, 10, -11, 13, -14, 14, -17, 18, -19, 20, -22, 
      25, -26, 26, -29, 33, -32, 34, -36, 40, -40, 41, -44, 47, -48, 
      49, -52, 55, -56, 55, -60, 61, -62, 62, -65, 67, -68, 66, -69, 
      72, -70, 70, -71, 74, -72, 72, -72, 74, -71, 70, -70, 72, -69, 
      66, -68, 67, -65, 62, -62, 61, -60, 55, -56, 55, -52, 49, -48, 
      47, -44, 41, -40, 40, -36, 34, -32, 33, -29, 26, -26, 25, -22, 
      20, -19, 18, -17, 14, -14, 13, -11, 10, -10, 9, -8, 6, -6, 6, 
      -5, 4, -3, 4, -3, 2, -2, 2, -1, 1, -1, 1, -1, 0, -1, 1});
  }
}
