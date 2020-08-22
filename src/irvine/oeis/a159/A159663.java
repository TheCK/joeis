package irvine.oeis.a159;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(11*x-100*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A159663 Numerator of Hermite(n, 11/20).
 * @author Georg Fischer
 */
public class A159663 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A159663() {
    super(0, "[[0],[200],[-11],[2,1]]", "[1,11,-79,-5269]", 2);
    setGfType(1);
  }
}
