package irvine.oeis.a085;
// Generated by gen_seq4.pl dex CR.ONE.cos().cos() true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A085663 Decimal expansion of cos(cos(1)).
 * @author Georg Fischer
 */
public class A085663 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A085663() {
    super(CR.ONE.cos().cos());
  }
}
