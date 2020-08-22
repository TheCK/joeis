package irvine.oeis.a274;
// Generated by gen_seq4.pl holos [[0],[10620,-28950,25066,-8634,1034],[-235380,673234,-632618,243200,-33088],[-54690,178937,-196637,88641,-13959],[-1530,8103,-13910,8298,-1551],[0,0,2322,-2249,517]] [1,1,7,37,211,1351] 0 at 2020-03-14 22:45
// Recurrence: n^2*(517*n^2-2249*n+2322)*a[n+0]=(1551*n^4-8298*n^3+13910*n^2-8103*n+1530)*a[n-1]+(13959*n^4-88641*n^3+196637*n^2-178937*n+54690)*a[n-2]+2*(16544*n^4-121600*n^3+316309*n^2-336617*n+117690)*a[n-3]-2*(n-3)^2*(517*n^2-1215*n+590)*a[n-4]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A274674 Diagonal of the rational function 1/(1 - x - x y - x z - y z + x y z).
 * @author Georg Fischer
 */
public class A274674 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A274674() {
    super(0, "[[0],[10620,-28950,25066,-8634,1034],[-235380,673234,-632618,243200,-33088],[-54690,178937,-196637,88641,-13959],[-1530,8103,-13910,8298,-1551],[0,0,2322,-2249,517]]", "[1,1,7,37,211,1351]", 0);
  }
}
