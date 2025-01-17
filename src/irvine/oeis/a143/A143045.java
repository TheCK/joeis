package irvine.oeis.a143;
// Generated by gen_seq4.pl holos [[0],[-2822400,6155072,-5387712,2436864,-603392,77824,-4096],[-169680,257808,-143136,34560,-3072],[1191960,-2988996,3057948,-1633632,480480,-73728,4608],[3780,-6822,3618,-576],[0,-29808,72846,-65745,27891,-5616,432]] [1,1,-2,-3,10] 0 at 2020-03-14 22:45
// Recurrence: 27*(n-2)*(n-1)*n*(16*n^3-160*n^2+521*n-552)*a[n+0]=18*(n-2)*(n-1)*(32*n-105)*a[n-1]-12*(n-2)*(384*n^5-5376*n^4+29288*n^3-77560*n^2+99709*n-49665)*a[n-2]+48*(2*n-7)*(32*n^3-248*n^2+623*n-505)*a[n-3]+64*(n-4)*(2*n-9)*(2*n-7)*(16*n^3-112*n^2+249*n-175)*a[n-4]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A143045 G.f.: A(x) = x + A(-x)^2.
 * @author Georg Fischer
 */
public class A143045 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A143045() {
    super(1, "[[0],[-2822400,6155072,-5387712,2436864,-603392,77824,-4096],[-169680,257808,-143136,34560,-3072],[1191960,-2988996,3057948,-1633632,480480,-73728,4608],[3780,-6822,3618,-576],[0,-29808,72846,-65745,27891,-5616,432]]", "[1,1,-2,-3,10]", 0);
  }
}
