package irvine.oeis.a293;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(x/(x-1))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A293116 E.g.f.: exp(x/(x-1)).
 * @author Georg Fischer
 */
public class A293116 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A293116() {
    super(0, "[[0],[0,1],[-1,-2],[2,1]]", "[1,-1,-1,-1]", 2);
    setGfType(1);
  }
}
