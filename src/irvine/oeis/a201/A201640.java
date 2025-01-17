package irvine.oeis.a201;
// Generated by gen_seq4.pl holos [[0],[-192,112,-16],[64,-124,34],[30,-78,36],[0,-2,-13],[1,2,1]] [1,8,54,368,2550] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A201640 Sum_{k=1..n} k*binomial(n,k)^3*(n^2+n-k*n-k+k^2)/((n-k+1)^2*n).
 * @author Georg Fischer
 */
public class A201640 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A201640() {
    super(1, "[[0],[-192,112,-16],[64,-124,34],[30,-78,36],[0,-2,-13],[1,2,1]]", "[1,8,54,368,2550]", 0);
  }
}
