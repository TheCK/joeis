package irvine.oeis.a131;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A131023 First subdiagonal of triangular array T: T(j,1) = 1 for ((j-1) mod 6) &lt; 3, else 0; T(j,k) = T(j-1,k-1) + T(j-1,k) for 2 &lt;= k &lt;= j.
 * @author Georg Fischer
 */
public class A131023 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A131023() {
    super(1, new long[] {0, 1, -3, 2, 1},
      new long[] {1, -5, 9, -6});
  }
}
