package irvine.oeis.a294;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp((1-x)*(1-x^2)*(1-x^3)*(1-x^4)-1)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A294257 E.g.f.: exp((1-x)*(1-x^2)*(1-x^3)*(1-x^4) - 1).
 * @author Georg Fischer
 */
public class A294257 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A294257() {
    super(0, "[[0],[-10],[9],[8],[0],[0],[-10],[0],[0],[2],[1],[10,1]]", "[1,-1,-1,5,1,199,-1409,-4579,25985,23759,13872511,-129511691]", 10);
    setGfType(1);
  }
}
