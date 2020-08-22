package irvine.oeis.a200;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A200674 Eccentricity of Tower of Hanoi graph H_n^{3} (divided by 3).
 * @author Georg Fischer
 */
public class A200674 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A200674() {
    super(0, new long[] {0, -1, 1, 2},
      new long[] {-1, 10, -27, 18});
  }
}
