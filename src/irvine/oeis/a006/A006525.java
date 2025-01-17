package irvine.oeis.a006;
// Generated by gen_seq4.pl egypfr at 2020-11-19 22:49
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.EgyptianFractionSequence;


/**
 * A006525 Denominators of greedy Egyptian fraction for e - 2.
 * @author Georg Fischer
 */
public class A006525 extends EgyptianFractionSequence {

  /** Construct the sequence. */
  public A006525() {
    super(CR.E.subtract(CR.TWO));
  }
}
