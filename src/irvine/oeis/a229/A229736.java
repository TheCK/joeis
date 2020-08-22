package irvine.oeis.a229;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A229736 G.f.: x^5*(2-5*x+3*x^2-x^3)/((1-x)^2*(1-2*x)^2*(1-3*x+x^2)).
 * @author Georg Fischer
 */
public class A229736 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A229736() {
    super(0, new long[] {0, 0, 0, 0, 0, 2, -5, 3, -1},
      new long[] {1, -9, 32, -57, 53, -24, 4});
  }
}
