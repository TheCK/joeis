package irvine.oeis.a323;
// Generated by gen_seq4.pl holos [[0],[72,-102,53,-12,1],[54,-69,29,-4],[19,-22,6],[5,-4],[1]] [0,1,3,14,87] 0 at 2020-02-15 22:07
// Recurrence: a[n+0]=(4*n-5)*a[n-1]-(6*n^2-22*n+19)*a[n-2]+(n-3)*(n-2)*(4*n-9)*a[n-3]-(n-4)*(n-3)^2*(n-2)*a[n-4]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A323771 Expansion of e.g.f. 2*exp(x/(2 - 2*x))*sinh(sqrt(5)*x/(2 - 2*x))/sqrt(5).
 * @author Georg Fischer
 */
public class A323771 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A323771() {
    super(0, "[[0],[72,-102,53,-12,1],[54,-69,29,-4],[19,-22,6],[5,-4],[1]]", "[0,1,3,14,87]", 0);
  }
}
