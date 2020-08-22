package irvine.oeis.a182;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A182349  G.f.: exp( Sum_{n&gt;=1} 6 * A084214(n) * x^n/n ) where g.f. of A084214 is (1+x^2)/((1+x)*(1-2*x)).
 * @author Georg Fischer
 */
public class A182349 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A182349() {
    super(0, new long[] {1},
      new long[] {1, -6, 6, 24, -39, -42, 72, 48, -48, -32});
  }
}
