package irvine.oeis.a244;
// Generated by gen_seq4.pl dex CR.PI.divide(CR.TWO.multiply(CR.SIX.sqrt())) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A244980 Decimal expansion of Pi/(2*sqrt(6)).
 * @author Georg Fischer
 */
public class A244980 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A244980() {
    super(CR.PI.divide(CR.TWO.multiply(CR.SIX.sqrt())));
  }
}
