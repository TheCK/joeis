package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019619 Decimal expansion of Pi*e/11.
 * @author Sean A. Irvine
 */
public class A019619 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019619() {
    super(CR.PI.multiply(CR.E).divide(CR.valueOf(11)));
  }
}
