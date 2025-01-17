package irvine.oeis.a200;
// Generated by gen_seq4.pl decsolv at 2021-08-03 20:49

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A200112 Decimal expansion of greatest x satisfying 2*x^2-cos(x)=3*sin(x).
 * Equation; 2*x^2-cos(x)-3*sin(x)
 * @author Georg Fischer
 */
public class A200112 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A200112() {
    super(1, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.multiply(x.pow(2)).subtract(x.cos()).subtract(CR.THREE.multiply(x.sin()));
      }
    }.inverseMonotone(CR.valueOf(1.232), CR.valueOf(1.282)).execute(CR.ZERO));
  }
}
