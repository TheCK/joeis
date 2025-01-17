package irvine.oeis.a086;
// Generated by gen_seq4.pl decexp at 2021-07-27 22:38

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;
/**
 * A086057 Decimal expansion of Masser-Gramain constant.
 * Formula: <code>Pi/4*(2*gamma+2*log(2)+3*log(Pi)-4*lnGamma(1/4)))</code>
 * @author Georg Fischer
 */
public class A086057 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A086057() {
    super(0, CR.PI.divide(CR.FOUR).multiply(CR.TWO.multiply(CR.GAMMA).add(CR.TWO.multiply(CR.TWO.log())).add(CR.THREE.multiply(CR.PI.log())).subtract(CR.FOUR.multiply(CR.ONE.divide(CR.FOUR).lnGamma()))));
  }
}
