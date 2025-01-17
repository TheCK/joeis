package irvine.oeis.a244;
// manually valuation/valuat at 2022-03-16 18:05

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a005.A005843;

/**
 * A244415 Exponent of 4 appearing in the 4-adic value of 1/n, n &gt;= 1, given in A240226(n).
 * @author Georg Fischer
 */
public class A244415 extends A005843 {

  /** Construct the sequence. */
  public A244415() {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.valuation(super.next(), Z.FOUR));
  }
}
