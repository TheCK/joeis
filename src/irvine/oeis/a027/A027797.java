package irvine.oeis.a027;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A027797 a(n) = 22*(n+1)*binomial(n+3,12).
 * @author Georg Fischer
 */
public class A027797 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A027797() {
    super(9, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 220, 66},
      new long[] {1, -14, 91, -364, 1001, -2002, 3003, -3432, 3003, -2002, 1001, 
      -364, 91, -14, 1});
  }
}
