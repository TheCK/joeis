package irvine.oeis.a194;
// Generated by gen_seq4.pl dexcr CR.FOUR.multiply(REALS.pow(CR.PI, CR.SIX)).multiply(CR.TWO.log()).subtract(CR.valueOf(90).multiply(REALS.pow(CR.PI, CR.FOUR)).multiply(Zeta.zeta(3))).add(CR.valueOf(1350).multiply(REALS.pow(CR.PI, CR.TWO)).multiply(Zeta.zeta(5))).subtract(CR.valueOf(5715).multiply(Zeta.zeta(7))).divide(CR.valueOf(1536)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A194657 Decimal expansion of (4*Pi^6*log(2) - 90*Pi^4*zeta(3) + 1350*Pi^2*zeta(5) - 5715*zeta(7))/1536.
 * @author Georg Fischer
 */
public class A194657 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A194657() {
    super(CR.FOUR.multiply(REALS.pow(CR.PI, CR.SIX)).multiply(CR.TWO.log()).subtract(CR.valueOf(90).multiply(REALS.pow(CR.PI, CR.FOUR)).multiply(Zeta.zeta(3))).add(CR.valueOf(1350).multiply(REALS.pow(CR.PI, CR.TWO)).multiply(Zeta.zeta(5))).subtract(CR.valueOf(5715).multiply(Zeta.zeta(7))).divide(CR.valueOf(1536)));
  }
}
