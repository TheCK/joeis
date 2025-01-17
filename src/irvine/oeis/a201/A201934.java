package irvine.oeis.a201;
// Generated by gen_seq4.pl decsolvn at 2021-08-03 20:49

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A201934 Decimal expansion of the x nearest 0 that satisfies x^2+5x+2=e^x.
 * Equation; x^2+5*x+2-exp(x)
 * @author Georg Fischer
 */
public class A201934 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A201934() {
    super(0, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return x.pow(2).add(CR.FIVE.multiply(x)).add(CR.TWO).subtract(x.exp());
      }
    }.inverseMonotone(CR.valueOf(-0.264), CR.valueOf(-0.254)).execute(CR.ZERO).negate());
  }
}
