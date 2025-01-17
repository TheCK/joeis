package irvine.oeis.a238;
// Generated by gen_seq4.pl dexcr CR.ONE.add(CR.FOUR.multiply(REALS.pow(CR.E, CR.ZERO.subtract(CR.THREE.divide(CR.TWO))))).divide(CR.THREE.multiply(CR.TAU.sqrt())) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A238387 Decimal expansion of (1 + 4*e^(-3/2))/(3*sqrt(2*Pi)).
 * @author Georg Fischer
 */
public class A238387 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A238387() {
    super(CR.ONE.add(CR.FOUR.multiply(REALS.pow(CR.E, CR.ZERO.subtract(CR.THREE.divide(CR.TWO))))).divide(CR.THREE.multiply(CR.TAU.sqrt())));
  }
}
