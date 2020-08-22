package irvine.oeis.a231;
// Generated by gen_seq4.pl holos [[0],[234,-999,817,-170],[-1404,5358,-5620,1700],[0,-9693,26709,-14790],[0,-666,-156,510]] [1,8,116,2096] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A231553 G.f. satisfies: A(x) = (1 + x*A(x))^2 * (1 + 3*A(x)) / 4.
 * @author Georg Fischer
 */
public class A231553 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A231553() {
    super(0, "[[0],[234,-999,817,-170],[-1404,5358,-5620,1700],[0,-9693,26709,-14790],[0,-666,-156,510]]", "[1,8,116,2096]", 0);
  }
}
