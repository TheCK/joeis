package irvine.oeis.a317;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A317790 a(n) = 2*a(n-1) - a(n-2) + a(n-4) - 2*(n-5) + a(n-6) for n&gt;5, a(0)=a(1)=1, a(2)=a(3)=7, a(4)=13, a(5)=19.
 * @author Georg Fischer
 */
public class A317790 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A317790() {
    super(0, new long[] {1, -1, 6, -6, 5, 1},
      new long[] {1, -2, 1, 0, -1, 2, -1});
  }
}
