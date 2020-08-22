package irvine.oeis.a107;
// Generated by gen_seq4.pl holos [[0],[1],[4],[0],[-4],[1]] [4,4,16,52,188] 0 at 2019-12-08 00:24
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A107382 a(n) = 4*a(n-1)-4*a(n-3)-a(n-4).
 * @author Georg Fischer
 */
public class A107382 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A107382() {
    super(1, "[[0],[1],[4],[0],[-4],[1]]", "[4,4,16,52,188]", 0);
  }
}
