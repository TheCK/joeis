package irvine.oeis.a193;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.PI, CR.FOUR).multiply(CR.TWO.log()).divide(CR.valueOf(64)).subtract(CR.NINE.multiply(REALS.pow(CR.PI, CR.TWO)).multiply(Zeta.zeta(3)).divide(CR.valueOf(64))).add(CR.valueOf(93).multiply(Zeta.zeta(5)).divide(CR.valueOf(128))) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A193717 Decimal expansion of Pi^4*log(2)/64 - 9*Pi^2*zeta(3)/64 + 93*zeta(5)/128.
 * @author Georg Fischer
 */
public class A193717 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A193717() {
    super(REALS.pow(CR.PI, CR.FOUR).multiply(CR.TWO.log()).divide(CR.valueOf(64)).subtract(CR.NINE.multiply(REALS.pow(CR.PI, CR.TWO)).multiply(Zeta.zeta(3)).divide(CR.valueOf(64))).add(CR.valueOf(93).multiply(Zeta.zeta(5)).divide(CR.valueOf(128))));
  }
}
