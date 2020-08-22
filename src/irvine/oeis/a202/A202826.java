package irvine.oeis.a202;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(1/(1-x)^3-1)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A202826 E.g.f.: exp( 1/(1-x)^3 - 1 ).
 * @author Georg Fischer
 */
public class A202826 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A202826() {
    super(0, "[[0],[0,1],[-4,-4],[12,6],[-15,-4],[4,1]]", "[1,3,21,195,2241,30483]", 4);
    setGfType(1);
  }
}
