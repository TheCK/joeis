package irvine.oeis.a201;
// Generated by gen_seq4.pl decsolv at 2021-08-11 21:56

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A201938 Decimal expansion of the greatest number x satisfying 2*x^2=e^(-x).
 * Equation; 2*x^2-(e^(-x))
 * @author Georg Fischer
 */
public class A201938 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A201938() {
    super(1, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.multiply(x.pow(2)).subtract(CR.E.pow(CR.ZERO.subtract(x)));
      }
    }.inverseMonotone(CR.valueOf(0.529), CR.valueOf(0.551)).execute(CR.ZERO));
  }
}
