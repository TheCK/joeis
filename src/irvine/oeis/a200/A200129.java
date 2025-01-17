package irvine.oeis.a200;
// Generated by gen_seq4.pl decsolv at 2021-08-03 20:49

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A200129 Decimal expansion of greatest x satisfying 2*x^2 - 4*cos(x) = sin(x).
 * Equation; 2*x^2-4*cos(x)-sin(x)
 * @author Georg Fischer
 */
public class A200129 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A200129() {
    super(1, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.multiply(x.pow(2)).subtract(CR.FOUR.multiply(x.cos())).subtract(x.sin());
      }
    }.inverseMonotone(CR.valueOf(1.114), CR.valueOf(1.160)).execute(CR.ZERO));
  }
}
