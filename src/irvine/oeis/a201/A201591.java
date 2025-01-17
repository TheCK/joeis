package irvine.oeis.a201;
// Generated by gen_seq4.pl decsolv at 2021-08-03 20:49

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A201591 Decimal expansion of least x satisfying 6*x^2 = csc(x) and 0 &lt; x &lt; Pi.
 * Equation; 6*x^2-csc(x)
 * @author Georg Fischer
 */
public class A201591 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A201591() {
    super(0, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return CR.SIX.multiply(x.pow(2)).subtract(x.sin().inverse());
      }
    }.inverseMonotone(CR.valueOf(0.549), CR.valueOf(0.571)).execute(CR.ZERO));
  }
}
