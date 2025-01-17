package irvine.oeis.a305;
// Generated by gen_seq4.pl holos [[0],[400,0,-25],[-355,45,35],[55,-24,-11],[0,3,1]] [0,0,3,19] 0 at 2020-02-15 22:07
// Recurrence: n*(n+3)*a[n+0]+(-11*n^2-24*n+55)*a[n-1]+5*(7*n^2+9*n-71)*a[n-2]-25*(n-4)*(n+4)*a[n-3]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A305555 Sum of the areas of all L-elevated skew paths of semi-length n.
 * @author Georg Fischer
 */
public class A305555 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A305555() {
    super(0, "[[0],[400,0,-25],[-355,45,35],[55,-24,-11],[0,3,1]]", "[0,0,3,19]", 0);
  }
}
