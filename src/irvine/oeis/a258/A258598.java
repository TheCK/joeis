package irvine.oeis.a258;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A258598 a(n) = 17*3^n.
 * @author Georg Fischer
 */
public class A258598 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A258598() {
    super(0, new long[] {17},
      new long[] {1, -3});
  }
}
