package irvine.oeis.a193;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.PI, CR.THREE).multiply(CR.TWO.log()).divide(CR.valueOf(24)).subtract(CR.THREE.multiply(CR.PI).multiply(Zeta.zeta(3)).divide(CR.valueOf(16))) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A193716 Decimal expansion of Pi^3*log(2)/24 - 3*Pi*zeta(3)/16.
 * @author Georg Fischer
 */
public class A193716 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.pow(CR.PI, CR.THREE).multiply(CR.TWO.log()).divide(CR.valueOf(24)).subtract(CR.THREE.multiply(CR.PI).multiply(Zeta.zeta(3)).divide(CR.valueOf(16)));

  @Override
  protected CR getCR() {
    return N;
  }
}
