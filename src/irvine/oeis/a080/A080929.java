package irvine.oeis.a080;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A080929 Sequence associated with a(n) = 2*a(n-1) + k*(k+2)*a(n-2).
 * @author Georg Fischer
 */
public class A080929 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A080929() {
    super(0, new long[] {1, -3, 6, -4},
      new long[] {1, -6, 12, -8});
  }
}
