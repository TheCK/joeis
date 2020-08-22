package irvine.oeis.a035;
// Generated by gen_seq4.pl holos [[0],[90,-100],[0,1]] [1,55] 0 at 2020-02-15 22:07
// Recurrence: n*a[n+0]+10*(-10*n+9)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A035323 Related to deca-factorial numbers A045757.
 * @author Georg Fischer
 */
public class A035323 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A035323() {
    super(1, "[[0],[90,-100],[0,1]]", "[1,55]", 0);
  }
}
