package irvine.oeis.a132;
// Generated by gen_seq4.pl egypfr at 2020-11-19 22:49
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.EgyptianFractionSequence;


/**
 * A132569 Egyptian fraction representation for the cube root of 95.
 * @author Georg Fischer
 */
public class A132569 extends EgyptianFractionSequence {

  /** Construct the sequence. */
  public A132569() {
    super(CR.valueOf(95).log().divide(CR.THREE).exp(), 1);
  }
}
