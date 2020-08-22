package irvine.oeis.a129;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A129961 Main diagonal of triangular array T: T(j,1) = 1 for ((j-1) mod 8) &lt; 4, else 0; T(j,k) = T(j-1,k-1)+T(j,k-1) for 2 &lt;= k &lt;= j.
 * @author Georg Fischer
 */
public class A129961 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A129961() {
    super(1, new long[] {0, 1, -4, 6, -4, 1},
      new long[] {1, -6, 14, -16, 10, -4});
  }
}
