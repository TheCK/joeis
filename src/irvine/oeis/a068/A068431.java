package irvine.oeis.a068;
// Generated by gen_seq4.pl dex CR.PI.sqrt() true 2 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A068431 Expansion of sqrt(Pi) in base 2.
 * @author Georg Fischer
 */
public class A068431 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A068431() {
    super(0, CR.SQRT_PI, 2);
  }
}
