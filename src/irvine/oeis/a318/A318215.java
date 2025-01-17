package irvine.oeis.a318;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(x/(1+x)^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A318215 Expansion of e.g.f. exp(x/(1 + x)^2).
 * @author Georg Fischer
 */
public class A318215 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A318215() {
    super(0, "[[0],[0,1],[4,3],[5,3],[3,1]]", "[1,1,-3,7,1]", 3);
    setGfType(1);
  }
}
