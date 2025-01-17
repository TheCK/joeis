package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155692 Decimal expansion of log_24(21).
 * @author Sean A. Irvine
 */
public class A155692 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155692() {
    super(CR.valueOf(21).log().divide(CR.valueOf(24).log()));
  }
}
