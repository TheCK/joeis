package irvine.oeis.a187;
// Generated by gen_seq4.pl holos [[0],[-819200,5160960,-12337152,15589376,-11708416,5430272,-1531904,241664,-16384],[-27328,168480,-393984,481088,-340096,141056,-32000,3072],[-304,1900,-4584,5676,-3856,1360,-192],[0,0,-13,28,-19,4]] [1,4,80,2832,144576] 0 at 2020-03-14 22:45
// Recurrence: (n-1)*n^2*(4*n^2-15*n+13)*a[n+0]=4*(n-1)*(48*n^5-292*n^4+672*n^3-747*n^2+399*n-76)*a[n-1]-32*(96*n^7-1000*n^6+4408*n^5-10628*n^4+15034*n^3-12312*n^2+5265*n-854)*a[n-2]+1024*(2*n-5)^2*(4*n^2-7*n+2)*(n-2)^4*a[n-3]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A187543 Binomial convolutions of the central Lah numbers (A187535).
 * @author Georg Fischer
 */
public class A187543 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A187543() {
    super(0, "[[0],[-819200,5160960,-12337152,15589376,-11708416,5430272,-1531904,241664,-16384],[-27328,168480,-393984,481088,-340096,141056,-32000,3072],[-304,1900,-4584,5676,-3856,1360,-192],[0,0,-13,28,-19,4]]", "[1,4,80,2832,144576]", 0);
  }
}
