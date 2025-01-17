package irvine.oeis.a090;
// Generated by gen_seq4.pl floor at 2021-08-30 23:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A090038 a(n) = floor(1/({n*k}-{n*k}^2)) -1, where k = sqrt(2)-1 and {} is the fractional part.
 * @author Georg Fischer
 */
public class A090038 extends FloorSequence {

  private final CR mK = CR.SQRT2.subtract(CR.ONE);

  /** Construct the sequence. */
  public A090038() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return CR.ONE.divide(mK.multiply(CR.valueOf(n)).frac().subtract(mK.multiply(CR.valueOf(n)).frac().pow(2))).floor().subtract(Z.ONE);
  }

}
