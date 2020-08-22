package irvine.oeis.a160;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(11*x-225*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A160293 Numerator of Hermite(n, 11/30).
 * @author Georg Fischer
 */
public class A160293 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A160293() {
    super(0, "[[0],[450],[-11],[2,1]]", "[1,11,-329,-13519]", 2);
    setGfType(1);
  }
}
