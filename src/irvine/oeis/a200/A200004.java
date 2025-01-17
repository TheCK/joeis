package irvine.oeis.a200;
// Generated by gen_seq4.pl decsolv at 2021-08-03 20:49

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A200004 Decimal expansion of least x satisfying 2*x^2 + cos(x) = 4*sin(x).
 * Equation; 2*x^2+cos(x)-4*sin(x)
 * @author Georg Fischer
 */
public class A200004 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A200004() {
    super(0, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.multiply(x.pow(2)).add(x.cos()).subtract(CR.FOUR.multiply(x.sin()));
      }
    }.inverseMonotone(CR.valueOf(0.278), CR.valueOf(0.290)).execute(CR.ZERO));
  }
}
