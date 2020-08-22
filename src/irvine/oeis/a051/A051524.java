package irvine.oeis.a051;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: -log(1-x)/(1-x)^6
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A051524 Second unsigned column of triangle A051338.
 * @author Georg Fischer
 */
public class A051524 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A051524() {
    super(0, "[[0],[36,12,1],[-13,-15,-2],[2,3,1]]", "[0,1,13,146]", 2);
    setGfType(1);
  }
}
