package irvine.oeis.a285;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A285631 a(n) = negative of exponent of s(1) in factorization of s(n) where s(1)^2 * s(n+2) * s(n-2) = s(2)^2 * s(n+1) * s(n-1) - s(3) * s(1) * s(n)^2, s(n) = -s(-n) for all n in Z,  with a(0) = -3, and s(1), s(2), s(3), s(4) are variables.
 * @author Georg Fischer
 */
public class A285631 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A285631() {
    super(0, new long[] {-3, 5, -1, -1, 0, 3, -1, -1, 1, 2, -1, -1, 2, 1, -1, -1, 3, 
      0, -1, 2, -1},
      new long[] {1, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
      -1, 2, -1});
  }
}
