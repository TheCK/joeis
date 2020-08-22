package irvine.oeis.a064;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A064748 a(n) = n*10^n + 1.
 * @author Georg Fischer
 */
public class A064748 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A064748() {
    super(0, new long[] {1, -10, 90},
      new long[] {1, -21, 120, -100});
  }
}
