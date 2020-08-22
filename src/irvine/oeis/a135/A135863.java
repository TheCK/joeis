package irvine.oeis.a135;
// Generated by gen_seq4.pl holos [[0],[20,-4],[16,-4],[2,-1],[1,-1]] [1,4,8,8] 0 at 2020-02-15 22:07
// Recurrence: (-n+1)*a[n+0]+(-n+2)*a[n-1]+4*(-n+4)*a[n-2]+4*(-n+5)*a[n-3]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A135863 G.f. A(x) = 1 + 4x*A(x)^(1/2) ; A(x) = 1 + 8x^2 + 4x*sqrt(1 + 4x^2).
 * @author Georg Fischer
 */
public class A135863 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A135863() {
    super(0, "[[0],[20,-4],[16,-4],[2,-1],[1,-1]]", "[1,4,8,8]", 0);
  }
}
