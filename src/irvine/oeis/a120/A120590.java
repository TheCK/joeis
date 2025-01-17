package irvine.oeis.a120;
// Generated by gen_seq4.pl holos [[0],[-105,108,-27],[-243,405,-162],[0,-13,13]] [1,1,3] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A120590 G.f. satisfies: 4*A(x) = 3 + x + A(x)^3, starting with [1,1,3].
 * @author Georg Fischer
 */
public class A120590 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A120590() {
    super(0, "[[0],[-105,108,-27],[-243,405,-162],[0,-13,13]]", "[1,1,3]", 0);
  }
}
