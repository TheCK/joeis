package irvine.oeis.a193;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A193418 Expansion of x*(x^2+x-1)/(3*x^6-4*x^5+x^4-3*x^2+4*x-1).
 * @author Georg Fischer
 */
public class A193418 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A193418() {
    super(1, new long[] {0, -1, 1, 1},
      new long[] {-1, 4, -3, 0, 1, -4, 3});
  }
}
