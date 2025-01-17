package irvine.oeis.a108;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A108627 Logarithmic g.f.: Sum_{n&gt;=1} a(n)/n*x^n = log(G108626(x)), where G108626(x) is g.f. for A108626.
 * @author Georg Fischer
 */
public class A108627 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A108627() {
    super(1, new long[] {0, 2, -2, 0, -2},
      new long[] {1, -4, 2, 0, 1});
  }
}
