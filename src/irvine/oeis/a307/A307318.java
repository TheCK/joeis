package irvine.oeis.a307;
// Generated by gen_seq4.pl holos [[0],[-226800,1545570,-3962775,5092479,-3622698,1449786,-305802,26460],[-362880,2439561,-6071312,7460459,-4998800,1853810,-355838,27440],[861840,-5939868,15610855,-20770423,15414556,-6472114,1437814,-131320],[-272160,1954737,-5534606,8085521,-6633248,3074822,-749546,74480],[0,0,-42162,131964,-159810,93696,-26628,2940]] [1,-2,37,-692,14371,-315002] 0 at 2020-03-14 22:45
// Recurrence: 6*(n-1)*n^2*(490*n^4-3948*n^3+11668*n^2-14967*n+7027)*a[n+0]=-(n-1)*(74480*n^6-675066*n^5+2399756*n^4-4233492*n^3+3852029*n^2-1682577*n+272160)*a[n-1]+(131320*n^7-1437814*n^6+6472114*n^5-15414556*n^4+20770423*n^3-15610855*n^2+5939868*n-861840)*a[n-2]-(27440*n^7-355838*n^6+1853810*n^5-4998800*n^4+7460459*n^3-6071312*n^2+2439561*n-362880)*a[n-3]-3*(2*n-5)*(3*n-8)*(3*n-7)*(490*n^4-1988*n^3+2764*n^2-1515*n+270)*a[n-4]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A307318 a(n) = Sum_{i=0..n} Sum_{j=0..n} Sum_{k=0..n} (-1)^(i+j+k) * (i+j+k)!/(i!*j!*k!).
 * @author Georg Fischer
 */
public class A307318 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A307318() {
    super(0, "[[0],[-226800,1545570,-3962775,5092479,-3622698,1449786,-305802,26460],[-362880,2439561,-6071312,7460459,-4998800,1853810,-355838,27440],[861840,-5939868,15610855,-20770423,15414556,-6472114,1437814,-131320],[-272160,1954737,-5534606,8085521,-6633248,3074822,-749546,74480],[0,0,-42162,131964,-159810,93696,-26628,2940]]", "[1,-2,37,-692,14371,-315002]", 0);
  }
}
