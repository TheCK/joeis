package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199449 Decimal expansion of x&gt;0 satisfying 3*x^2+2*x*sin(x)=cos(x).
 * Equation; 3*x^2+2*x*sin(x)-(cos(x))
 * @author Georg Fischer
 */
public class A199449 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199449() {
    super(0, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return CR.THREE.multiply(x.pow(2)).add(CR.TWO.multiply(x).multiply(x.sin())).subtract(x.cos());
      }
    }.inverseMonotone(CR.valueOf(0.420), CR.valueOf(0.438)).execute(CR.ZERO));
  }
}
