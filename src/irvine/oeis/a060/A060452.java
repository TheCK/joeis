package irvine.oeis.a060;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A060452 Let v = (1,4,9,...,n^2), x = (0,1,2,4,6,...) [first n terms of A002620]; a(n) = v.v * x.x - (v.x)^2.
 * @author Georg Fischer
 */
public class A060452 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A060452() {
    super(1, new long[] {0, 0, -1, -5, -26, -39, -66, -39, -26, -5, -1},
      new long[] {-1, 1, 6, -6, -15, 15, 20, -20, -15, 15, 6, -6, -1, 1});
  }
}
