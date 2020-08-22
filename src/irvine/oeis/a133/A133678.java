package irvine.oeis.a133;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A133678 a(n)=6*a(n-1)+42*a(n-2) for n&gt;=3, a(0)=1, a(1)=6, a(2)=72 .
 * @author Georg Fischer
 */
public class A133678 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A133678() {
    super(0, new long[] {1, 0, -6},
      new long[] {1, -6, -42});
  }
}
