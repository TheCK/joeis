package irvine.oeis.a285;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A285187 a(n) = Sum(psi(k-1)*psi(n-k-1),k=0..n)+(1-(-1)^n)/2, where psi(k) = A000931(k+6).
 * @author Georg Fischer
 */
public class A285187 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A285187() {
    super(0, new long[] {1, 3, 0, -4, -3, 1, 2, 1},
      new long[] {1, 0, -3, -2, 3, 4, 0, -2, -1});
  }
}
