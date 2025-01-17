package irvine.oeis.a174;
// Generated by gen_seq4.pl decexp at 2021-07-16 22:36

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A174607 Decimal expansion of Pi^2/(6*log(Phi)) where Phi=(1+sqrt(5))/2.
 * Formula: Pi^2/(6*log(phi))
 * @author Georg Fischer
 */
public class A174607 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A174607() {
    super(1, CR.PI.pow(CR.TWO).divide(CR.SIX.multiply(CR.PHI.log())));
  }
}
