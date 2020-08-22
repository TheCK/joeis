package irvine.oeis.a170;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A170775 a(n) = n^8*(n^3 + 1)/2.
 * @author Georg Fischer
 */
public class A170775 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A170775() {
    super(0, new long[] {0, 1, 1140, 78096, 1103484, 4859754, 7862124, 4878360, 1100004, 74541, 
      896},
      new long[] {1, -12, 66, -220, 495, -792, 924, -792, 495, -220, 66, -12, 1});
  }
}
