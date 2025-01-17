package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolv at 2021-08-01 19:50

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199049 Decimal expansion of x &gt; 0 satisfying x^2 + sin(x) = 3.
 * Equation; x^2+sin(x)-3
 * @author Georg Fischer
 */
public class A199049 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199049() {
    super(1, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return x.pow(2).add(x.sin()).subtract(CR.THREE);
      }
    }.inverseMonotone(CR.valueOf(1.390), CR.valueOf(1.446)).execute(CR.ZERO));
  }
}
