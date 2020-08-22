package irvine.oeis.a164;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A164703 a(n) = 8*a(n-2) for n &gt; 2; a(1) = 1, a(2) = 16.
 * @author Georg Fischer
 */
public class A164703 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A164703() {
    super(1, new long[] {0, 1, 16},
      new long[] {1, 0, -8});
  }
}
