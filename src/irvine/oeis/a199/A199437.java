package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199437 Decimal expansion of x&gt;0 satisfying x^2+3*x*sin(x)=3*cos(x).
 * Equation; x^2+3*x*sin(x)-(3*cos(x))
 * @author Georg Fischer
 */
public class A199437 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199437() {
    super(0, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return x.pow(2).add(CR.THREE.multiply(x).multiply(x.sin())).subtract(CR.THREE.multiply(x.cos()));
      }
    }.inverseMonotone(CR.valueOf(0.748), CR.valueOf(0.779)).execute(CR.ZERO));
  }
}
