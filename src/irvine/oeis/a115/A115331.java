package irvine.oeis.a115;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(x+5/2*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A115331 E.g.f.: exp(x+5/2*x^2).
 * @author Georg Fischer
 */
public class A115331 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A115331() {
    super(0, "[[0],[-5],[-1],[2,1]]", "[1,1,6,16]", 2);
    setGfType(1);
  }
}
