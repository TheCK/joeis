package irvine.oeis.a224;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: 1/(1-32*x)^(1/16)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A224882 G.f.: 1/(1 - 32*x)^(1/16).
 * @author Georg Fischer
 */
public class A224882 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A224882() {
    super(0, "[[0],[2,32],[-1,-1]]", "[1,2,34]", 1);
  }
}
