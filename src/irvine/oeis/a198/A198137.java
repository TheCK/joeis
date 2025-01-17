package irvine.oeis.a198;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A198137 Decimal expansion of greatest x having 2*x^2-4x=-3*cos(x).
 * Equation; 2*x^2-4x-(-3*cos(x))
 * @author Georg Fischer
 */
public class A198137 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A198137() {
    super(1, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.multiply(x.pow(2)).subtract(CR.FOUR.multiply(x)).subtract(CR.ZERO.subtract(CR.THREE.multiply(x.cos())));
      }
    }.inverseMonotone(CR.valueOf(2.426), CR.valueOf(2.526)).execute(CR.ZERO));
  }
}
