package irvine.oeis.a060;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(-x^5/5)/(1-x)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A060725 E.g.f.: exp(-(x^5/5))/(1-x).
 * @author Georg Fischer
 */
public class A060725 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A060725() {
    super(0, "[[0],[1],[-1],[0],[0],[0],[6,1],[-6,-1]]", "[1,1,2,6,24,96,576,4032]", 6);
    setGfType(1);
  }
}
