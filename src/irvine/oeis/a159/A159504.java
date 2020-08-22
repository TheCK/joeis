package irvine.oeis.a159;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(20*x-169*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A159504 Numerator of Hermite(n, 10/13).
 * @author Georg Fischer
 */
public class A159504 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A159504() {
    super(0, "[[0],[338],[-20],[2,1]]", "[1,20,62,-12280]", 2);
    setGfType(1);
  }
}
