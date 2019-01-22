package irvine.oeis.a017;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017938.
 * @author Sean A. Irvine
 */
public class A017938 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(11);
    return CR.valueOf(mN).sqrt().add(CR.HALF).floor(32);
  }
}

