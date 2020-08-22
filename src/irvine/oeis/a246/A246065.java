package irvine.oeis.a246;
// Generated by gen_seq4.pl holos [[0],[9,18,9],[-63,-58,-19],[47,46,11],[-9,-6,-1]] [-1,1,9,39,177] 3 at 2020-03-14 22:45
// Recurrence: 9*(n+1)^2*a[n+0]-(19*n^2+58*n+63)*a[n+1]+(11*n^2+46*n+47)*a[n+2]-(n+3)^2*a[n+3]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A246065 a(n) = sum_{k=0..n}C(n,k)^2*C(2k,k)/(2k-1), where C(n,k) denotes the binomial coefficient n!/(k!*(n-k)!).
 * @author Georg Fischer
 */
public class A246065 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A246065() {
    super(0, "[[0],[9,18,9],[-63,-58,-19],[47,46,11],[-9,-6,-1]]", "[-1,1,9,39,177]", 3);
  }
}
