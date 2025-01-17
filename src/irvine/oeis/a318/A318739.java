package irvine.oeis.a318;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.PI, CR.TWO).divide(CR.valueOf(24)).subtract(CR.ONE.divide(CR.valueOf(12)).multiply(REALS.pow(CR.TWO.add(CR.FIVE.sqrt()).log(), CR.TWO))) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A318739 Decimal expansion of Pi^2 / 24 - (1/12) * log(2 + sqrt(5))^2.
 * @author Georg Fischer
 */
public class A318739 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A318739() {
    super(REALS.pow(CR.PI, CR.TWO).divide(CR.valueOf(24)).subtract(CR.ONE.divide(CR.valueOf(12)).multiply(REALS.pow(CR.TWO.add(CR.FIVE.sqrt()).log(), CR.TWO))));
  }
}
