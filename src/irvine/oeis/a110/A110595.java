package irvine.oeis.a110;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A110595 a(1)=5. For n &gt; 1, a(n) = 4*5^(n-1) = A005054(n).
 * @author Georg Fischer
 */
public class A110595 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A110595() {
    super(1, new long[] {0, 5, -5},
      new long[] {1, -5});
  }
}
