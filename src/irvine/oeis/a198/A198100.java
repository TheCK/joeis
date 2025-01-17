package irvine.oeis.a198;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A198100 Decimal expansion of least x having x^2-4x=-2*cos(x).
 * Equation; x^2-4x-(-2*cos(x))
 * @author Georg Fischer
 */
public class A198100 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A198100() {
    super(0, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return x.pow(2).subtract(CR.FOUR.multiply(x)).subtract(CR.ZERO.subtract(CR.TWO.multiply(x.cos())));
      }
    }.inverseMonotone(CR.valueOf(0.491), CR.valueOf(0.511)).execute(CR.ZERO));
  }
}
