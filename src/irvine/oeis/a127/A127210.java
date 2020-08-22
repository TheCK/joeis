package irvine.oeis.a127;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A127210 a(n) = 3^n*Lucas(n), where Lucas = A000204.
 * @author Georg Fischer
 */
public class A127210 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A127210() {
    super(1, new long[] {0, 3, 18},
      new long[] {1, -3, -9});
  }
}
