package irvine.oeis.a130;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A130917 a(n) is the sum of the digital roots of all of the previous terms.
 * @author Georg Fischer
 */
public class A130917 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A130917() {
    super(1, new long[] {0, 1, -1, 1, 2, 1, 5},
      new long[] {1, -2, 1, 1, -2, 1});
  }
}
