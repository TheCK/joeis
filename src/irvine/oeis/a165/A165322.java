package irvine.oeis.a165;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A165322 a(0)=1, a(1)=7, a(n)=15*a(n-1)-49*a(n-2) for n&gt;1.
 * @author Georg Fischer
 */
public class A165322 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A165322() {
    super(0, new long[] {1, -8},
      new long[] {1, -15, 49});
  }
}
