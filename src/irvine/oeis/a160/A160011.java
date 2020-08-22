package irvine.oeis.a160;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(14*x-625*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A160011 Numerator of Hermite(n, 7/25).
 * @author Georg Fischer
 */
public class A160011 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A160011() {
    super(0, "[[0],[1250],[-14],[2,1]]", "[1,14,-1054,-49756]", 2);
    setGfType(1);
  }
}
