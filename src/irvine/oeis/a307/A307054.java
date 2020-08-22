package irvine.oeis.a307;
// Generated by gen_seq4.pl dex CR.PI.multiply(CR.E.sqrt()).add(CR.E.multiply(CR.PI.sqrt())) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A307054 Decimal expansion of Pi*sqrt(e) + e*sqrt(Pi).
 * @author Georg Fischer
 */
public class A307054 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.multiply(CR.E.sqrt()).add(CR.E.multiply(CR.PI.sqrt()));

  @Override
  protected CR getCR() {
    return N;
  }
}
