package irvine.oeis.a094;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.E, CR.E.add(CR.PI)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A094771 Decimal expansion of e^(e + Pi).
 * @author Georg Fischer
 */
public class A094771 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A094771() {
    super(REALS.pow(CR.E, CR.E.add(CR.PI)));
  }
}
