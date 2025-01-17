package irvine.oeis.a276;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A276722 Number of set partitions of [n] such that for each block b the smallest integer interval containing b has at most six elements.
 * @author Georg Fischer
 */
public class A276722 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A276722() {
    super(0, new long[] {1, 0, -2, -5, -5, 5, -14, -16, -3, 28, -2, 10, 26, 22, -11, 
      0, -18, -7, 15, 1, 0, 0, -1},
      new long[] {1, -1, -3, -5, -4, -3, -84, -146, -137, 49, 346, 716, 589, 382, 
      250, -200, -1319, -1058, 382, 584, -401, -882, -346, 85, 263, 52, 
      -210, -111, -6, -5, 1, 5, 1});
  }
}
