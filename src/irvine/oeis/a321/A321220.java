package irvine.oeis.a321;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A321220 a(n) = n+2 if n is even, otherwise a(n) = 2*n+1 if n is odd.
 * @author Georg Fischer
 */
public class A321220 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A321220() {
    super(0, new long[] {2, 3, 0, 1},
      new long[] {1, 0, -2, 0, 1});
  }
}
