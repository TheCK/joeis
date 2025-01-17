package irvine.oeis.a198;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A198878 Decimal expansion of x&gt;0 satisfying 2*x^2-3*cos(x)=-1.
 * Equation; 2*x^2-3*cos(x)-(-1)
 * @author Georg Fischer
 */
public class A198878 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A198878() {
    super(0, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.multiply(x.pow(2)).subtract(CR.THREE.multiply(x.cos())).subtract(CR.ZERO.subtract(CR.ONE));
      }
    }.inverseMonotone(CR.valueOf(0.748), CR.valueOf(0.779)).execute(CR.ZERO));
  }
}
