package irvine.oeis.a198;
// Generated by gen_seq4.pl decsolv at 2021-08-01 19:50

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A198867 Decimal expansion of x &gt; 0 satisfying x^2 + sin(x) = 1.
 * Equation; x^2+sin(x)-1
 * @author Georg Fischer
 */
public class A198867 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A198867() {
    super(0, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return x.pow(2).add(x.sin()).subtract(CR.ONE);
      }
    }.inverseMonotone(CR.valueOf(0.624), CR.valueOf(0.649)).execute(CR.ZERO));
  }
}
