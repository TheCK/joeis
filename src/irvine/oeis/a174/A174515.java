package irvine.oeis.a174;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A174515 O.g.f.: exp( Sum_{n&gt;=1} (2^n+3^n)^2*x^n/n ).
 * @author Georg Fischer
 */
public class A174515 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A174515() {
    super(0, new long[] {1},
      new long[] {1, -25, 228, -900, 1296});
  }
}
