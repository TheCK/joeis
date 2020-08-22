package irvine.oeis.a115;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A115164 a(n) = 3*a(n-1) + 4*a(n-2), with a(0) = 3, a(1) = 7, a(3) = 9, for n &gt; 2.
 * @author Georg Fischer
 */
public class A115164 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A115164() {
    super(0, new long[] {-3, 2, 24},
      new long[] {-1, 3, 4});
  }
}
