package irvine.oeis.a090;
// Generated by gen_seq4.pl holos [[0],[5040,-13068,13132,-6769,1960,-322,28,-1],[5040,-12348,11368,-5145,1225,-147,7],[2520,-5754,4725,-1785,315,-21],[840,-1750,1225,-350,35],[210,-385,210,-35],[47,-68,21],[6,-7],[1]] [1,13,163,2353,40501,818821,18929023,489586273] 0 at 2019-12-08 00:24
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A090134 a(n) = (6*n!/(n+5)) *binomial(n+5,n-1)* 6F6(-n+1, 1/5*n+1, 1/5*n+9/5, 1/5*n+8/5, 1/5*n+7/5, 1/5*n+6/5; 7/6, 4/3, 3/2, 5/3, 11/6, 2; -3125/46656), where 6F6(;;) is the generalized hypergeometric series.
 * @author Georg Fischer
 */
public class A090134 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A090134() {
    super(1, "[[0],[5040,-13068,13132,-6769,1960,-322,28,-1],[5040,-12348,11368,-5145,1225,-147,7],[2520,-5754,4725,-1785,315,-21],[840,-1750,1225,-350,35],[210,-385,210,-35],[47,-68,21],[6,-7],[1]]", "[1,13,163,2353,40501,818821,18929023,489586273]", 0);
  }
}
