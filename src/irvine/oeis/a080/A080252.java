package irvine.oeis.a080;
// Generated by gen_seq4.pl holos [[0],[-8,4],[-4],[0,-1],[1]] [0,1,2] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A080252 a(n) = n*a(n-1)+4*a(n-2)-4*(n-2)*a(n-3).
 * @author Georg Fischer
 */
public class A080252 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A080252() {
    super(0, "[[0],[-8,4],[-4],[0,-1],[1]]", "[0,1,2]", 0);
  }
}
