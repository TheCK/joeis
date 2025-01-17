package irvine.oeis.a200;
// Generated by gen_seq4.pl decsolvr at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A200359 Decimal expansion of least x&gt;0 satisfying 2*x^2+3=tan(x).
 * Equation; 2*x^2+3-(tan(x))
 * @author Georg Fischer
 */
public class A200359 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A200359() {
    super(1, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.multiply(x.pow(2)).add(CR.THREE).subtract(REALS.tan(x));
      }
    }.inverseMonotone(CR.valueOf(1.401), CR.valueOf(1.459)).execute(CR.ZERO));
  }
}
