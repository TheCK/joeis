package irvine.oeis.a198;
// Generated by gen_seq4.pl decsolv at 2021-08-09 22:50

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A198141 Decimal expansion of greatest x having x^2-2x=-3*cos(x).
 * Equation; x^2-2*x-(-3*cos(x))
 * @author Georg Fischer
 */
public class A198141 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A198141() {
    super(1, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return x.pow(2).subtract(CR.TWO.multiply(x)).subtract(CR.ZERO.subtract(CR.THREE.multiply(x.cos())));
      }
    }.inverseMonotone(CR.valueOf(2.931), CR.valueOf(3.051)).execute(CR.ZERO));
  }
}
