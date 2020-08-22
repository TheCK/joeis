package irvine.oeis.a074;
// Generated by gen_seq4.pl dex CR.PI.add(CR.E).divide(CR.TWO).subtract(CR.PI.multiply(CR.E).sqrt()) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A074921 Decimal expansion of (Pi + e)/2 - sqrt(Pi*e).
 * @author Georg Fischer
 */
public class A074921 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.add(CR.E).divide(CR.TWO).subtract(CR.PI.multiply(CR.E).sqrt());

  @Override
  protected CR getCR() {
    return N;
  }
}
