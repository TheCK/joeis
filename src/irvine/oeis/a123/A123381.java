package irvine.oeis.a123;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A123381 Values x of the solutions (x,y) of the Diophantine equation 5*(X-Y)^4 - 16*X*Y = 0 with X &gt;= Y.
 * @author Georg Fischer
 */
public class A123381 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A123381() {
    super(0, new long[] {0, 40, -1936, 40},
      new long[] {1, -340, 5798, -340, 1});
  }
}
