package irvine.oeis.a322;
// Generated by gen_seq4.pl holos [0,-2,3,1,-3,1] [2,3,4,9] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A322783 a(n) = 1 - n + (2^(n+2) - (-1)^n)/3.
 * @author Georg Fischer
 */
public class A322783 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A322783() {
    super(1, "[0,-2,3,1,-3,1]", "[2,3,4,9]", 0);
  }
}
