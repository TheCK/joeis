package irvine.oeis.a198;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A198502 Decimal expansion of x&gt;0 having 3*x^2=2*sin(x).
 * Equation; 3*x^2-(2*sin(x))
 * @author Georg Fischer
 */
public class A198502 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A198502() {
    super(0, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return CR.THREE.multiply(x.pow(2)).subtract(CR.TWO.multiply(x.sin()));
      }
    }.inverseMonotone(CR.valueOf(0.612), CR.valueOf(0.637)).execute(CR.ZERO));
  }
}
