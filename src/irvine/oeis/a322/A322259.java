package irvine.oeis.a322;
// Generated by gen_seq4.pl decexp at 2021-07-18 19:09

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A322259 Decimal expansion of exp(-9 + 5*phi), where phi is the golden ratio.
 * Formula: exp(-9+5*phi)
 * @author Georg Fischer
 */
public class A322259 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A322259() {
    super(0, CR.ZERO.subtract(CR.NINE).add(CR.FIVE.multiply(CR.PHI)).exp());
  }
}
