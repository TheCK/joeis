package irvine.oeis.a182;
// Generated by gen_seq4.pl holos [[0],[1360,-1864,888,-144],[-590,956,-462,72],[76,-127,60,-9]] [24,128,648] 0 at 2020-03-14 22:45
// Recurrence: -(n-1)*(9*n^2-51*n+76)*a[n+0]+2*(36*n^3-231*n^2+478*n-295)*a[n-1]-8*(2*n-5)*(9*n^2-33*n+34)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A182186 Number b(n) of basic ideals in the Borel subalgebra of the untwisted affine Lie algebra of type B.
 * @author Georg Fischer
 */
public class A182186 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A182186() {
    super(2, "[[0],[1360,-1864,888,-144],[-590,956,-462,72],[76,-127,60,-9]]", "[24,128,648]", 0);
  }
}
