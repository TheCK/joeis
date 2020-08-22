package irvine.oeis.a201;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: x/sqrt(1+x^2-2*x*sqrt(1+4*x^2))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A201645 G.f.: x/sqrt(1 + x^2 - 2*x*sqrt(1 + 4*x^2)).
 * @author Georg Fischer
 */
public class A201645 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A201645() {
    super(1, "[[0],[0,840,420],[0],[1462,1173,221],[0],[614,209,9],[0],[-98,-65,-9],[0],[-42,-13,-1]]", "[1,1,1,3,7,11,21,53,113,211]", 8);
  }
}
