package irvine.oeis.a251;
// Generated by gen_seq4.pl holos [[0],[-75000,-9781250,21328125,-18359375,5859375],[1169280,111813225,-465687750,872214375,-945634375,632984375,-258828125,59375000,-5859375],[-424344,4117576,-15021584,27222056,-26835480,14605200,-4144000,480000]] [1,4,47,1034] 0 at 2020-03-14 22:45
// Recurrence: 8*(2*n-1)*(4*n-3)*(4*n-1)*(1875*n^4-13375*n^3+35700*n^2-41905*n+17681)*a[n+0]=5*(1171875*n^8-11875000*n^7+51765625*n^6-126596875*n^5+189126875*n^4-174442875*n^3+93137550*n^2-22362645*n-233856)*a[n-1]-3125*(1875*n^4-5875*n^3+6825*n^2-3130*n-24)*a[n-2]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A251665 E.g.f.: exp(5*x*G(x)^4) / G(x) where G(x) = 1 + x*G(x)^5 is the g.f. of A002294.
 * @author Georg Fischer
 */
public class A251665 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A251665() {
    super(0, "[[0],[-75000,-9781250,21328125,-18359375,5859375],[1169280,111813225,-465687750,872214375,-945634375,632984375,-258828125,59375000,-5859375],[-424344,4117576,-15021584,27222056,-26835480,14605200,-4144000,480000]]", "[1,4,47,1034]", 0);
  }
}
