package irvine.oeis.a221;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A221076 Continued fraction expansion of product_{n&gt;=0} (1-sqrt(5)*[sqrt(5)-2]^{4n+3})/(1-sqrt(5)*[sqrt(5)-2]^{4n+1}).
 * @author Georg Fischer
 */
public class A221076 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A221076() {
    super(0, new long[] {-2, -16, 1, -16, 36, 0, -18, 0, -2, 0, 1},
      new long[] {-1, 0, 1, 0, 18, 0, -18, 0, -1, 0, 1});
  }
}
