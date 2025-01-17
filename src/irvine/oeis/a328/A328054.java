package irvine.oeis.a328;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: log(1+x/(1-x)^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A328054 Expansion of e.g.f. log(1 + x / (1 - x)^2).
 * @author Georg Fischer
 */
public class A328054 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A328054() {
    super(0, "[[0],[0,1,1],[1,0,-1],[-8,-4],[15,8,1],[-12,-7,-1]]", "[0,1,3,8,18,24]", 4);
    setGfType(1);
  }
}
