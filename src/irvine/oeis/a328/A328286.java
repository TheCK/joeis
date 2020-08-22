package irvine.oeis.a328;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: -log(1-x-x^2/2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A328286 Expansion of e.g.f. -log(1 - x - x^2/2).
 * @author Georg Fischer
 */
public class A328286 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A328286() {
    super(1, "[[0],[0,0,1],[2,5,3],[8,4],[-12,-10,-2]]", "[1,2,5,21,114]", 3);
    setGfType(1);
  }
}
