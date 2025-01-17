package irvine.oeis.a200;
// Generated by gen_seq4.pl decsolvr at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A200630 Decimal expansion of least x&gt;0 satisfying 5*x^2+3=tan(x).
 * Equation; 5*x^2+3-(tan(x))
 * @author Georg Fischer
 */
public class A200630 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A200630() {
    super(1, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return CR.FIVE.multiply(x.pow(2)).add(CR.THREE).subtract(REALS.tan(x));
      }
    }.inverseMonotone(CR.valueOf(1.470), CR.valueOf(1.530)).execute(CR.ZERO));
  }
}
