package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199383 Decimal expansion of x&gt;0 satisfying 2*x^2+2*x*sin(x)=3.
 * Equation; 2*x^2+2*x*sin(x)-(3)
 * @author Georg Fischer
 */
public class A199383 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199383() {
    super(0, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.multiply(x.pow(2)).add(CR.TWO.multiply(x).multiply(x.sin())).subtract(CR.THREE);
      }
    }.inverseMonotone(CR.valueOf(0.877), CR.valueOf(0.913)).execute(CR.ZERO));
  }
}
