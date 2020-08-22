package irvine.oeis.a246;
// Generated by gen_seq4.pl holos [[0],[-1024,1536,-576,64],[2960,-4640,1920,-240],[-780,1364,-644,92],[-530,865,-450,75],[-65,157,-115,23],[15,-50,60,-15],[0,0,-3,1]] [1,5,37,325,3125,31925,339077] 0 at 2020-02-15 22:07
// Recurrence: (n-3)*n^2*a[n+0]=5*(n-3)*(3*n^2-3*n+1)*a[n-1]-(n-1)*(23*n^2-92*n+65)*a[n-2]-5*(n-2)*(15*n^2-60*n+53)*a[n-3]-4*(n-3)*(23*n^2-92*n+65)*a[n-4]+80*(n-1)*(3*n^2-21*n+37)*a[n-5]-64*(n-4)^2*(n-1)*a[n-6]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A246540 G.f.: Sum_{n&gt;=0} 4^n * x^n / (1-x)^(2*n+1) * [Sum_{k=0..n} C(n,k)^2 * x^k]^2.
 * @author Georg Fischer
 */
public class A246540 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A246540() {
    super(0, "[[0],[-1024,1536,-576,64],[2960,-4640,1920,-240],[-780,1364,-644,92],[-530,865,-450,75],[-65,157,-115,23],[15,-50,60,-15],[0,0,-3,1]]", "[1,5,37,325,3125,31925,339077]", 0);
  }
}
