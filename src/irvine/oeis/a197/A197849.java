package irvine.oeis.a197;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A197849 Decimal expansion of least x having x^2-2x=-2*cos(x).
 * Equation; x^2-2x-(-2*cos(x))
 * @author Georg Fischer
 */
public class A197849 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A197849() {
    super(1, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return x.pow(2).subtract(CR.TWO.multiply(x)).subtract(CR.ZERO.subtract(CR.TWO.multiply(x.cos())));
      }
    }.inverseMonotone(CR.valueOf(1.027), CR.valueOf(1.069)).execute(CR.ZERO));
  }
}
