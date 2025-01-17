package irvine.oeis.a198;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A198755 Decimal expansion of x&gt;0 satisfying x^2+cos(x)=2.
 * Equation; x^2+cos(x)-(2)
 * @author Georg Fischer
 */
public class A198755 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A198755() {
    super(1, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return x.pow(2).add(x.cos()).subtract(CR.TWO);
      }
    }.inverseMonotone(CR.valueOf(1.299), CR.valueOf(1.352)).execute(CR.ZERO));
  }
}
