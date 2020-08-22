package irvine.oeis.a159;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(30*x-361*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A159653 Numerator of Hermite(n, 15/19).
 * @author Georg Fischer
 */
public class A159653 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A159653() {
    super(0, "[[0],[722],[-30],[2,1]]", "[1,30,178,-37980]", 2);
    setGfType(1);
  }
}
