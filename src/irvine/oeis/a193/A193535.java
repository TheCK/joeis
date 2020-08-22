package irvine.oeis.a193;
// Generated by gen_seq4.pl dex CR.TWO.log().divide(CR.THREE) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A193535 Decimal expansion of log(2)/3.
 * @author Georg Fischer
 */
public class A193535 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.log().divide(CR.THREE);

  @Override
  protected CR getCR() {
    return N;
  }
}
