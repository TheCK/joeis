package irvine.oeis.a135;
// Generated by gen_seq4.pl decexp at 2021-07-16 22:36

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A135544 Decimal expansion of (-1)^(I Pi).
 * Formula: exp(-Pi)^(Pi)
 * @author Georg Fischer
 */
public class A135544 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A135544() {
    super(0, CR.ZERO.subtract(CR.PI).exp().pow(CR.PI));
  }
}
