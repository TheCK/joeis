package irvine.oeis.a122;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: (exp(x^2)*(exp(2*x)+1))/2
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A122648 Expansion of e.g.f.: exp(x^2)*(exp(2*x)+1)/2.
 * @author Georg Fischer
 */
public class A122648 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A122648() {
    super(0, "[[0],[4],[4],[-10,-4],[-6,-2],[12,7,1]]", "[1,1,4,10,44,156]", 4);
    setGfType(1);
  }
}
