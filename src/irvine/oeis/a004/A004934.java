package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004934 Floor of n*phi^19, where phi is the golden ratio, A001622.
 * @author Sean A. Irvine
 */
public class A004934 implements Sequence {

  private static final CR PHI_POWER = ComputableReals.SINGLETON.pow(CR.PHI, 19);

  private long mN = -1;

  @Override
  public Z next() {
    return PHI_POWER.multiply(++mN).floor();
  }
}
