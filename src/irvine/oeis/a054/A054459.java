package irvine.oeis.a054;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A054459 A001333(n), n &gt;= 1, convolved with itself.
 * @author Georg Fischer
 */
public class A054459 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A054459() {
    super(0, new long[] {1, 2, 1},
      new long[] {1, -4, 2, 4, 1});
  }
}
