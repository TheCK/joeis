package irvine.oeis.a099;
// Generated by gen_seq4.pl holos [[0],[1],[-21],[-21],[1]] [0,1,20,441,9680] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=21*a[n-1]+21*a[n-2]-a[n-3]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A099278 Unsigned member r=-20 of the family of Chebyshev sequences S_r(n) defined in A092184.
 * @author Georg Fischer
 */
public class A099278 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A099278() {
    super(0, "[[0],[1],[-21],[-21],[1]]", "[0,1,20,441,9680]", 0);
  }
}
