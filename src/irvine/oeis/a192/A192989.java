package irvine.oeis.a192;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp((1+x)^3-1)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A192989 Expansion of e.g.f.: exp((1+x)^3 - 1).
 * @author Georg Fischer
 */
public class A192989 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A192989() {
    super(0, "[[0],[-3],[-6],[-3],[3,1]]", "[1,3,15,87,585]", 3);
    setGfType(1);
  }
}
