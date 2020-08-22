package irvine.oeis.a238;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A238055 a(n) = (13*3^n-1)/2.
 * @author Georg Fischer
 */
public class A238055 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A238055() {
    super(0, new long[] {6, -5},
      new long[] {1, -4, 3});
  }
}
