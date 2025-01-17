package irvine.oeis.a197;
// Generated by gen_seq4.pl dex CR.PI.divide(CR.SIX.add(CR.FOUR.multiply(CR.PI))) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A197696 Decimal expansion of Pi/(6 + 4*Pi).
 * @author Georg Fischer
 */
public class A197696 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A197696() {
    super(CR.PI.divide(CR.SIX.add(CR.FOUR.multiply(CR.PI))));
  }
}
