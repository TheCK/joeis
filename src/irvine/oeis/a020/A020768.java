package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020768 Decimal expansion of 1/sqrt(11).
 * @author Sean A. Irvine
 */
public class A020768 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020768() {
    super(CR.valueOf(11).sqrt().inverse());
  }
}
