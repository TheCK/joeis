package irvine.oeis.a052;
// Generated by gen_seq4.pl holos [[0],[2,1,-1],[-1,1]] [0,0,0,6] 1 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A052747 a(0) = a(1) = a(2) = 0; a(n) = n!/(n-2) for n &gt; 2.
 * @author Georg Fischer
 */
public class A052747 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A052747() {
    super(0, "[[0],[2,1,-1],[-1,1]]", "[0,0,0,6]", 1);
  }
}
