package irvine.oeis.a062;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A062883 (1-2*cos(1/11*Pi))^n+(1+2*cos(2/11*Pi))^n+(1-2*cos(3/11*Pi))^n+(1+2*cos(4/11*Pi))^n+(1-2*cos(5/11*Pi))^n.
 * @author Georg Fischer
 */
public class A062883 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A062883() {
    super(1, new long[] {0, 4, -4, -15, 8, 5},
      new long[] {1, -4, 2, 5, -2, -1});
  }
}
