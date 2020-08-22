package irvine.oeis.a029;
// Generated by gen_seq4.pl holos [0,-1,1,0,-1,1] [1,1,2,4,8] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A029898 Pitoun's sequence: a(n+1) is digital root of a(0) + ... + a(n).
 * @author Georg Fischer
 */
public class A029898 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A029898() {
    super(1, "[0,-1,1,0,-1,1]", "[1,1,2,4,8]", 0);
  }
}
