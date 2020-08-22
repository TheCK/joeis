package irvine.oeis.a052;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A052935 Expansion of (2-2*x-x^3)/((1-2*x)*(1-x^3)).
 * @author Georg Fischer
 */
public class A052935 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A052935() {
    super(0, new long[] {2, -2, 0, -1},
      new long[] {1, -2, 0, -1, 2});
  }
}
