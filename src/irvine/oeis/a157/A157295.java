package irvine.oeis.a157;
// Generated by gen_seq4.pl dexcr CR.valueOf(630).divide(REALS.pow(CR.PI, CR.SIX)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A157295 Decimal expansion of 630/Pi^6.
 * @author Georg Fischer
 */
public class A157295 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A157295() {
    super(CR.valueOf(630).divide(REALS.pow(CR.PI, CR.SIX)));
  }
}
