package irvine.oeis.a321;
// Generated by gen_seq4.pl holos [0,-10,-3,1] [-1,23] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A321133 a(n) = 3*a(n-1) + 10*a(n-2), n &gt;= 2; a(0)=-1, a(1)=23.
 * @author Georg Fischer
 */
public class A321133 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A321133() {
    super(1, "[0,-10,-3,1]", "[-1,23]", 0);
  }
}
