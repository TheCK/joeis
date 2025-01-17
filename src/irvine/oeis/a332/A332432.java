package irvine.oeis.a332;
// manually floorr at 2021-09-01 13:58

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A332432 a(n) = [2^n/(1 - cos(1/n))] - [2^n/(-1 + cot(1/n))], where [ ] = floor.
 * @author Georg Fischer
 */
public class A332432 extends FloorSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  /** Construct the sequence. */
  public A332432() {
    super(1);
  }

  protected Z evalCR(final long n) {
    final CR n2 = CR.valueOf(Z.ONE.shiftLeft((int) n));
    final CR n1 = CR.valueOf(n).inverse();
    final CR nCos = n2.divide(CR.ONE.subtract(n1.cos()));
    final CR nCot = n2.divide(REALS.cot(n1).subtract(CR.ONE));
    return nCos.floor().subtract(nCot.floor());
  }

}
