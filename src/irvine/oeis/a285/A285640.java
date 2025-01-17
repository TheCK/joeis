package irvine.oeis.a285;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A285640 a(n) = negative of exponent of s(2) in factorization of s(n) where s(1)^2 * s(n+2) * s(n-2) = s(2)^2 * s(n+1) * s(n-1) - s(3) * s(1) * s(n)^2, s(n) = -s(-n) for all n in Z,  with a(0) = -2, and s(1), s(2), s(3), s(4) are variables.
 * @author Georg Fischer
 */
public class A285640 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A285640() {
    super(0, new long[] {-2, 4, -3, 2, -1, 0, 1, -2, 3, -3, 3, -2, 1, 0, -1, 2, -1},
      new long[] {1, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 2, 
      -1});
  }
}
