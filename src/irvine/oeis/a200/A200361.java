package irvine.oeis.a200;
// Generated by gen_seq4.pl decsolvr at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A200361 Decimal expansion of least x&gt;0 satisfying 2*x^2+x+2=tan(x).
 * Equation; 2*x^2+x+2-(tan(x))
 * @author Georg Fischer
 */
public class A200361 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A200361() {
    super(1, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.multiply(x.pow(2)).add(x).add(CR.TWO).subtract(REALS.tan(x));
      }
    }.inverseMonotone(CR.valueOf(1.410), CR.valueOf(1.468)).execute(CR.ZERO));
  }
}
