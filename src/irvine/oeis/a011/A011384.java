package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011384 Decimal expansion of 10th root of 17.
 * @author Sean A. Irvine
 */
public class A011384 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(17), CR.TEN.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
