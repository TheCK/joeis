package irvine.oeis.a073;
// Generated by gen_seq4.pl decexprb at 2021-07-18 19:09

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;
import irvine.oeis.PrependSequence;

/**
 * A073070 Binary expansion of 1/AGM(1,sqrt(2)).
 * Formula: 1/agm(1,sqrt(2))
 * @author Georg Fischer
 */
public class A073070 extends PrependSequence {

  /** Construct the sequence. */
  public A073070() {
    super(new DecimalExpansionSequence(1, CR.ONE.divide(CR.ONE.agm(CR.TWO.sqrt())), 2), 0);
  }
}
