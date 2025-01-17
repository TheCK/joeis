package irvine.oeis.a118;
// Generated by gen_seq4.pl holos [0,-1,0,0,0,0,0,1] [6,9,12,24,45,57,78,90] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A118521 Define sequence S_m by: initial term = m, reverse digits and add 3 to get next term. Entry shows S_6. This reaches a cycle of length 6 in 2 steps.
 * @author Georg Fischer
 */
public class A118521 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A118521() {
    super(1, "[0,-1,0,0,0,0,0,1]", "[6,9,12,24,45,57,78,90]", 0);
  }
}
