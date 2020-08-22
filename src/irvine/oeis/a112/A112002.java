package irvine.oeis.a112;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A112002 Seventh diagonal of triangle A008275 (Stirling1) and seventh column of |A008276|.
 * @author Georg Fischer
 */
public class A112002 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A112002() {
    super(1, new long[] {0, 720, 3708, 4400, 1452, 114, 1},
      new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 
      13, -1});
  }
}
