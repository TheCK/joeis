package irvine.oeis.a198;
// Generated by gen_seq4.pl decsolv at 2021-08-09 22:50

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A198879 Decimal expansion of x&gt;0 satisfying 2*x^2-3*cos(x)=1.
 * Equation; 2*x^2-3*cos(x)-(1)
 * @author Georg Fischer
 */
public class A198879 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A198879() {
    super(1, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.multiply(x.pow(2)).subtract(CR.THREE.multiply(x.cos())).subtract(CR.ONE);
      }
    }.inverseMonotone(CR.valueOf(1.069), CR.valueOf(1.113)).execute(CR.ZERO));
  }
}
