package irvine.oeis.a046;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A046163 Reduced denominators of (n-1)^2/(n^2+n+1). Arises in Routh's theorem.
 * @author Georg Fischer
 */
public class A046163 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A046163() {
    super(1, new long[] {0, 1, 7, 13, 4, 10, 4, 1, 1, 1},
      new long[] {1, 0, 0, -3, 0, 0, 3, 0, 0, -1});
  }
}
