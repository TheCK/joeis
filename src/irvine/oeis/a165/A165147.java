package irvine.oeis.a165;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A165147 a(n) = (3*7^n-3^n)/2.
 * @author Georg Fischer
 */
public class A165147 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A165147() {
    super(0, new long[] {1, -1},
      new long[] {1, -10, 21});
  }
}
