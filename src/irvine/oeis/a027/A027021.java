package irvine.oeis.a027;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A027021 a(n) = T(n,n) + T(n,m+1) + ... + T(n,n), where m=[ (n+2)/2 ], T given by A027011.
 * @author Georg Fischer
 */
public class A027021 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A027021() {
    super(1, new long[] {0, 1, -1, 0, -1, 10, 0, -4},
      new long[] {1, -2, -4, 8, 4, -8, -1, 2});
  }
}
