package irvine.oeis.a131;
// Generated by gen_seq4.pl dexcr CR.ONE.divide(REALS.pow(CR.E.multiply(CR.PI).multiply(CR.PHI), CR.TWO)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A131567 Decimal expansion of 1/((e*Pi*phi)^2).
 * @author Georg Fischer
 */
public class A131567 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A131567() {
    super(CR.ONE.divide(REALS.pow(CR.E.multiply(CR.PI).multiply(CR.PHI), CR.TWO)));
  }
}
