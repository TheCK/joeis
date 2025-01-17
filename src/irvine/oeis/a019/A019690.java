package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019690 Decimal expansion of Pi/23.
 * @author Sean A. Irvine
 */
public class A019690 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019690() {
    super(CR.PI.divide(CR.valueOf(23)));
  }
}
