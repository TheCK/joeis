package irvine.oeis.a302;
// Generated by gen_seq4.pl dex CR.TWO.multiply(CR.PI.divide(CR.valueOf(120)).sin()) false 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A302715 Decimal expansion of 2*sin(Pi/120).
 * @author Georg Fischer
 */
public class A302715 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.multiply(CR.PI.divide(CR.valueOf(120)).sin());

  /** Construct the sequence. */
  public A302715() {
    super(false, 10);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
