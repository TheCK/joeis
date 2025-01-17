package irvine.oeis.a134;
// Generated by gen_seq4.pl floorr at 2021-08-30 23:16

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A134909 a(n) = floor(n*exp(-cot n)).
 * @author Georg Fischer
 */
public class A134909 extends FloorSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  /** Construct the sequence. */
  public A134909() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return CR.valueOf(n).multiply(CR.ZERO.subtract(REALS.cot(CR.valueOf(n))).exp()).floor();
  }

}
