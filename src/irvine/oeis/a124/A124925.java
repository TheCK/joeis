package irvine.oeis.a124;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A124925 Interlaced triples: a(3n+1)=1, a(3n+2) = 2n+3, a(3n+3)= A028387(n).
 * @author Georg Fischer
 */
public class A124925 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A124925() {
    super(1, new long[] {0, -1, -3, -1, 2, 4, -2, -1, -1, 1},
      new long[] {-1, 0, 0, 3, 0, 0, -3, 0, 0, 1});
  }
}
