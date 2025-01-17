package irvine.oeis.a198;
// Generated by gen_seq4.pl decsolvn at 2021-08-09 18:13

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A198234 Decimal expansion of least x having 3*x^2+3x=4*cos(x).
 * Equation; 3*x^2+3*x-4*cos(x)
 * @author Georg Fischer
 */
public class A198234 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A198234() {
    super(1, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return CR.THREE.multiply(x.pow(2)).add(CR.THREE.multiply(x)).subtract(CR.FOUR.multiply(x.cos()));
      }
    }.inverseMonotone(CR.valueOf(-1.314), CR.valueOf(-1.262)).execute(CR.ZERO).negate());
  }
}
