package irvine.oeis.a322;
// Generated by gen_seq4.pl padding 0 at 2020-08-22 18:36
// DO NOT EDIT here!

import irvine.oeis.PaddingSequence;


/**
 * A322175 Determinant of the symmetric n X n matrix M defined by M(i,j) = mu(gcd(i,j)) for 1 &lt;= i,j &lt;= n where mu is the Moebius function.
 * @author Georg Fischer
 */
public class A322175 extends PaddingSequence {

  /** Construct the sequence. */
  public A322175() {
    super(new long[] {1, 1, -2, 4, 4, -8, -32, 64}, new long[] {0});
  }
}
