package irvine.oeis.a201;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A201241 Number of ways to place 7 non-attacking wazirs on an n X n toroidal board.
 * @author Georg Fischer
 */
public class A201241 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A201241() {
    super(1, new long[] {0, 0, 0, 0, -16, -4210, -377910, -5096582, -14870470, 1105140, 6257200, 
      -6886942, 2412258, 1577312, -2640636, 1885230, -923282, 351708, -107472, 
      24982, -3930, 354, -14},
      new long[] {-1, 15, -105, 455, -1365, 3003, -5005, 6435, -6435, 5005, -3003, 
      1365, -455, 105, -15, 1});
  }
}
