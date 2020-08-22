package irvine.oeis.a159;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(18*x-361*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A159647 Numerator of Hermite(n, 9/19).
 * @author Georg Fischer
 */
public class A159647 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A159647() {
    super(0, "[[0],[722],[-18],[2,1]]", "[1,18,-398,-33156]", 2);
    setGfType(1);
  }
}
