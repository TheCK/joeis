package irvine.oeis.a298;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A298802 Growth series for group with presentation &lt; S, T : S^4 = T^4 = (S*T)^4 = 1 &gt;.
 * @author Georg Fischer
 */
public class A298802 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A298802() {
    super(0, new long[] {1, 2, 2, 2, 1},
      new long[] {1, -2, 0, -2, 1});
  }
}
