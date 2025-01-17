package irvine.oeis.a243;
// Generated by gen_seq4.pl holos [[1,0,-50,0,400,0,-1120,0,1280,0,-512],[1]] [-1,1] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=(2*n^2-1)*(256*n^8-512*n^6+304*n^4-48*n^2+1)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A243136 512*n^10 - 1280*n^8 + 1120*n^6 - 400*n^4 + 50*n^2 - 1.
 * @author Georg Fischer
 */
public class A243136 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A243136() {
    super(0, "[[1,0,-50,0,400,0,-1120,0,1280,0,-512],[1]]", "[-1,1]", 0);
  }
}
