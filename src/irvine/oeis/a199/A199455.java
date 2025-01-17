package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199455 Decimal expansion of x&gt;0 satisfying x^2-x*sin(x)=2*cos(x).
 * Equation; x^2-x*sin(x)-(2*cos(x))
 * @author Georg Fischer
 */
public class A199455 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199455() {
    super(1, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return x.pow(2).subtract(x.multiply(x.sin())).subtract(CR.TWO.multiply(x.cos()));
      }
    }.inverseMonotone(CR.valueOf(1.302), CR.valueOf(1.356)).execute(CR.ZERO));
  }
}
