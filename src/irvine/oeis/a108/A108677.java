package irvine.oeis.a108;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A108677 a(n) = (n+1)*(n+2)*(n+3)*(n+4)*(19*n^2 + 47*n + 30)/720.
 * @author Georg Fischer
 */
public class A108677 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A108677() {
    super(0, new long[] {1, 9, 9},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
