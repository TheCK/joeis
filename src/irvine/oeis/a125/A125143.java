package irvine.oeis.a125;
// Generated by gen_seq4.pl holos [[0],[-81,243,-243,81],[-3,13,-21,14],[0,0,0,1]] [1,-3,9] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A125143 Almkvist-Zudilin numbers: Sum_{k=0..n} (-1)^(n-k) * ((3^(n-3*k) * (3*k)!) / (k!)^3) * binomial(n,3*k) * binomial(n+k,k).
 * @author Georg Fischer
 */
public class A125143 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A125143() {
    super(0, "[[0],[-81,243,-243,81],[-3,13,-21,14],[0,0,0,1]]", "[1,-3,9]", 0);
  }
}
