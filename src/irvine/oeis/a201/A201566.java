package irvine.oeis.a201;
// Generated by gen_seq4.pl decsolv at 2021-08-03 20:49

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A201566 Decimal expansion of least x satisfying x^2 + 3 = csc(x) and 0 &lt; x &lt; Pi.
 * Equation; x^2+3-csc(x)
 * @author Georg Fischer
 */
public class A201566 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A201566() {
    super(0, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return x.pow(2).add(CR.THREE).subtract(x.sin().inverse());
      }
    }.inverseMonotone(CR.valueOf(0.321), CR.valueOf(0.334)).execute(CR.ZERO));
  }
}
