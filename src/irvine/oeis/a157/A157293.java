package irvine.oeis.a157;
// Generated by gen_seq4.pl dexcr Zeta.zeta(3).divide(Zeta.zeta(9)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.ComputableReals;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A157293 Decimal expansion of Zeta(3)/Zeta(9).
 * @author Georg Fischer
 */
public class A157293 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A157293() {
    super(Zeta.zeta(3).divide(Zeta.zeta(9)));
  }
}
