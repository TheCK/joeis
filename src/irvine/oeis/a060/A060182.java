package irvine.oeis.a060;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A060182 a(0) = 1, a(1) = 5, a(2) = 13; a(n) = 2*a(n-1) + 2, n &gt; 2.
 * @author Georg Fischer
 */
public class A060182 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A060182() {
    super(0, new long[] {1, 2, 0, -1},
      new long[] {1, -3, 2});
  }
}
