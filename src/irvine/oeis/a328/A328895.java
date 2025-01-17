package irvine.oeis.a328;
// Generated by gen_seq4.pl decexp at 2021-07-16 22:36

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A328895 Decimal expansion of Sum_{k&gt;=1} Kronecker(8,k)/k^2.
 * Formula: Pi^2/(8*sqrt(2))
 * @author Georg Fischer
 */
public class A328895 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A328895() {
    super(0, CR.PI.pow(2).divide(CR.EIGHT.multiply(CR.TWO.sqrt())));
  }
}
