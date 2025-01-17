package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolvn at 2021-08-03 20:49

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199607 Decimal expansion of least x satisfying x^2+3*x*cos(x)=2*sin(x).
 * Equation; x^2+3*x*cos(x)-2*sin(x)
 * @author Georg Fischer
 */
public class A199607 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199607() {
    super(0, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return x.pow(2).add(CR.THREE.multiply(x).multiply(x.cos())).subtract(CR.TWO.multiply(x.sin()));
      }
    }.inverseMonotone(CR.valueOf(-0.609), CR.valueOf(-0.585)).execute(CR.ZERO).negate());
  }
}
