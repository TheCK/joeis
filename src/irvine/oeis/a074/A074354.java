package irvine.oeis.a074;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A074354 Coefficient of q^3 in nu(n), where nu(0)=1, nu(1)=b and, for n&gt;=2, nu(n)=b*nu(n-1)+lambda*(1+q+q^2+...+q^(n-2))*nu(n-2) with (b,lambda)=(1,2).
 * @author Georg Fischer
 */
public class A074354 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A074354() {
    super(0, new long[] {0, 0, 0, 0, 0, 14, 8, -66, -28, 72, 48},
      new long[] {1, -4, -2, 20, 1, -40, -8, 32, 16});
  }
}
