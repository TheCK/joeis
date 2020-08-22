package irvine.oeis.a049;
// Generated by gen_seq4.pl holos [[0],[3456,-10896,9836,-3288,364],[-6912,21960,-21402,8226,-1092],[-432,-1812,3884,-2196,364],[0,3936,-12636,9900,-2184],[0,1740,-95,-1380,455]] [1,1,2,6,20] 0 at 2020-02-15 22:07
// Recurrence: 5*n*(n+1)*(91*n^2-367*n+348)*a[n+0]=12*n*(182*n^3-825*n^2+1053*n-328)*a[n-1]-4*(91*n^4-549*n^3+971*n^2-453*n-108)*a[n-2]+6*(n-3)*(182*n^3-825*n^2+1092*n-384)*a[n-3]-4*(n-4)*(n-3)*(91*n^2-185*n+72)*a[n-4]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A049124 Revert transform of (-1 + x + x^2)/((x - 1)*(x + 1)).
 * @author Georg Fischer
 */
public class A049124 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A049124() {
    super(0, "[[0],[3456,-10896,9836,-3288,364],[-6912,21960,-21402,8226,-1092],[-432,-1812,3884,-2196,364],[0,3936,-12636,9900,-2184],[0,1740,-95,-1380,455]]", "[1,1,2,6,20]", 0);
  }
}
