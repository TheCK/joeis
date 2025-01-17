package irvine.oeis.a059;
// Generated by gen_seq4.pl floor at 2021-09-01 21:58

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A059290 a(n) = round(1/144*n^2*(n + 3)).
 * @author Georg Fischer
 */
public class A059290 extends FloorSequence {
  /** Construct the sequence. */
  public A059290() {
    super(0);
  }

  @Override
  protected Z evalCR(final long n) {
    return CR.ONE.divide(CR.valueOf(144)).multiply(CR.valueOf(n).pow(2)).multiply(CR.valueOf(n).add(CR.THREE)).round();
  }

}
