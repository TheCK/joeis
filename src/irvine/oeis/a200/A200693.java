package irvine.oeis.a200;
// Generated by gen_seq4.pl decsolvr at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A200693 Decimal expansion of least x&gt;0 satisfying 9-x^2=tan(x).
 * Equation; 9-x^2-(tan(x))
 * @author Georg Fischer
 */
public class A200693 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A200693() {
    super(1, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return CR.NINE.subtract(x.pow(2)).subtract(REALS.tan(x));
      }
    }.inverseMonotone(CR.valueOf(1.399), CR.valueOf(1.457)).execute(CR.ZERO));
  }
}
