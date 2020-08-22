package irvine.oeis.a110;
// Generated by gen_seq4.pl holos [[0],[0,-64,-272,1024,-932,160,124,-40],[0,-48,-118,512,-398,-28,80],[0,0,41,-116,9,10],[60,240,38,-222,-80],[-90,9,87,30]] [0,1,3,22,148] 0 at 2020-02-15 22:07
// Recurrence: 3*(n+2)*(10*n^2+9*n-15)*a[n+0]=2*(n+1)*(40*n^3+71*n^2-90*n-30)*a[n-1]-n^2*(10*n^3+9*n^2-116*n+41)*a[n-2]-2*(n-1)^2*n*(40*n^3+66*n^2-107*n-24)*a[n-3]+4*(n-2)^2*(n-1)^2*n*(10*n^2+29*n+4)*a[n-4]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A110469 Convolution of J(n)*n! and n! where J(n)=A001045(n), n-th Jacobsthal number.
 * @author Georg Fischer
 */
public class A110469 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A110469() {
    super(0, "[[0],[0,-64,-272,1024,-932,160,124,-40],[0,-48,-118,512,-398,-28,80],[0,0,41,-116,9,10],[60,240,38,-222,-80],[-90,9,87,30]]", "[0,1,3,22,148]", 0);
  }
}
