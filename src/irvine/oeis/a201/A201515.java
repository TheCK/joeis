package irvine.oeis.a201;
// Generated by gen_seq4.pl decsolvr at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A201515 Decimal expansion of least x satisfying 3*x^2 - 1 = sec(x) and 0 &lt; x &lt; Pi.
 * Equation; 3*x^2-1-(sec(x))
 * @author Georg Fischer
 */
public class A201515 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A201515() {
    super(0, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return CR.THREE.multiply(x.pow(2)).subtract(CR.ONE).subtract(REALS.sec(x));
      }
    }.inverseMonotone(CR.valueOf(0.934), CR.valueOf(0.973)).execute(CR.ZERO));
  }
}
