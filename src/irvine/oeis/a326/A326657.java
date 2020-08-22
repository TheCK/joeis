package irvine.oeis.a326;
// Generated by gen_seq4.pl holos [0,-1,2,0,-2,1] [1,0,5,6] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A326657 a(n) = 4*floor(n/2) + ceiling((n-1)^2/2).
 * @author Georg Fischer
 */
public class A326657 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A326657() {
    super(1, "[0,-1,2,0,-2,1]", "[1,0,5,6]", 0);
  }
}
