package irvine.oeis.a242;
// Generated by gen_seq4.pl dex CR.PI.divide(CR.valueOf(24)).sqrt().exp() true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A242910 Decimal expansion of exp(sqrt(Pi/24)).
 * @author Georg Fischer
 */
public class A242910 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.divide(CR.valueOf(24)).sqrt().exp();

  @Override
  protected CR getCR() {
    return N;
  }
}
