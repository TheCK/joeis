package irvine.oeis.a133;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A133592 a(n)=2*a(n-1)+6*a(n-2) for n&gt;=3, a(0)=1, a(1)=2, a(2)=8 .
 * @author Georg Fischer
 */
public class A133592 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A133592() {
    super(0, new long[] {1, 0, -2},
      new long[] {1, -2, -6});
  }
}
