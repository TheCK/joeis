package irvine.oeis.a068;
// Generated by gen_seq4.pl dexcr Zeta.zeta(3) true 2 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A068428 Expansion of zeta(3) in base 2.
 * @author Georg Fischer
 */
public class A068428 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A068428() {
    super(0, Zeta.zeta(3), 2);
  }
}
