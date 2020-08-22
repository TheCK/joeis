package irvine.oeis.a131;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A131739 a(4n) = a(4n+1) = n, a(4n+2) = 3n+2, a(4n+3) = 3n+3.
 * @author Georg Fischer
 */
public class A131739 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A131739() {
    super(0, new long[] {0, 0, 2, -1, 1},
      new long[] {1, -2, 3, -4, 3, -2, 1});
  }
}
