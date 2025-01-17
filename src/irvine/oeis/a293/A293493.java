package irvine.oeis.a293;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(x/(1-x^3))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A293493 E.g.f.: exp(x/(1 - x^3)).
 * @author Georg Fischer
 */
public class A293493 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A293493() {
    super(0, "[[0],[0,1],[0],[-2],[-6,-2],[0],[-1],[6,1]]", "[1,1,1,1,25,121,361,5881]", 6);
    setGfType(1);
  }
}
