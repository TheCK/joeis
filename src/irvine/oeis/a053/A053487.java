package irvine.oeis.a053;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(4*x)/(1-x)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A053487 E.g.f.: exp(4x)/(1-x).
 * @author Georg Fischer
 */
public class A053487 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A053487() {
    super(0, "[[0],[-4],[6,1],[-2,-1]]", "[1,5,26,142]", 2);
    setGfType(1);
  }
}
