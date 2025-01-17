package irvine.oeis.a062;
// Generated by gen_seq4.pl floorr at 2021-08-30 23:16

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A062233 a(n) = floor(sin(n)*cos(2*n)^2*tan(4*n)^3).
 * @author Georg Fischer
 */
public class A062233 extends FloorSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  /** Construct the sequence. */
  public A062233() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return CR.valueOf(n).sin().multiply(CR.TWO.multiply(CR.valueOf(n)).cos().pow(2)).multiply(REALS.tan(CR.FOUR.multiply(CR.valueOf(n))).pow(3)).floor();
  }

}
