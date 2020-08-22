package irvine.oeis.a305;
// Generated by gen_seq4.pl holos [[0],[-100,25],[95,-35],[-20,11],[1,-1]] [0,1,4,22] 0 at 2020-02-15 22:07
// Recurrence: (-n+1)*a[n+0]+(11*n-20)*a[n-1]+5*(-7*n+19)*a[n-2]+25*(n-4)*a[n-3]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A305554 Sum of the areas of all D-elevated skew paths of semi-length n.
 * @author Georg Fischer
 */
public class A305554 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A305554() {
    super(0, "[[0],[-100,25],[95,-35],[-20,11],[1,-1]]", "[0,1,4,22]", 0);
  }
}
