package irvine.oeis.a177;
// Generated by gen_seq4.pl dex CR.valueOf(195).add(CR.valueOf(65029).sqrt()).divide(CR.valueOf(314)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A177038 Decimal expansion of (195+sqrt(65029))/314.
 * @author Georg Fischer
 */
public class A177038 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(195).add(CR.valueOf(65029).sqrt()).divide(CR.valueOf(314));

  @Override
  protected CR getCR() {
    return N;
  }
}
