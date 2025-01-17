package irvine.oeis.a293;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(-x^3/(1+x))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A293123 E.g.f.: exp(-x^3/(1+x)).
 * @author Georg Fischer
 */
public class A293123 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A293123() {
    super(0, "[[0],[2],[3],[2,1],[6,2],[4,1]]", "[1,0,0,-6,24,-120]", 4);
    setGfType(1);
  }
}
