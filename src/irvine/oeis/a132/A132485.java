package irvine.oeis.a132;
// Generated by gen_seq4.pl egypfr at 2020-11-19 22:49
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.EgyptianFractionSequence;


/**
 * A132485 Egyptian fraction representation for the cube root of 9.
 * @author Georg Fischer
 */
public class A132485 extends EgyptianFractionSequence {

  /** Construct the sequence. */
  public A132485() {
    super(CR.NINE.log().divide(CR.THREE).exp(), 1);
  }
}
