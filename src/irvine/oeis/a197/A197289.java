package irvine.oeis.a197;
// Generated by gen_seq4.pl decsolv at 2021-08-09 22:50

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A197289 Decimal expansion of least x&gt;0 having sin(5x)=(sin 8x)^2.
 * Equation; sin(5*x)-((sin(8*x))^2)
 * @author Georg Fischer
 */
public class A197289 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A197289() {
    super(0, new UnaryCRFunction() { 
      @Override 
      public CR execute(final CR x) {
        return CR.FIVE.multiply(x).sin().subtract(CR.EIGHT.multiply(x).sin().pow(2));
      }
    }.inverseMonotone(CR.valueOf(0.228), CR.valueOf(0.237)).execute(CR.ZERO));
  }
}
