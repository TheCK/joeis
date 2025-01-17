package irvine.oeis.a132;
// Generated by gen_seq4.pl egypfr at 2020-11-19 22:49
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.EgyptianFractionSequence;


/**
 * A132484 Egyptian fraction representation for the cube root of 7.
 * @author Georg Fischer
 */
public class A132484 extends EgyptianFractionSequence {

  /** Construct the sequence. */
  public A132484() {
    super(CR.SEVEN.log().divide(CR.THREE).exp(), 1);
  }
}
