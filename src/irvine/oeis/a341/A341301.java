package irvine.oeis.a341;
// Generated by gen_seq4.pl floor at 2021-08-30 23:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A341301 a(n) = ceiling(n^2 - 7*n/3 + 19/3).
 * @author Georg Fischer
 */
public class A341301 extends FloorSequence {
  /** Construct the sequence. */
  public A341301() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return CR.valueOf(n).pow(2).subtract(CR.SEVEN.multiply(CR.valueOf(n)).divide(CR.THREE)).add(CR.valueOf(19).divide(CR.THREE)).ceil();
  }

}
