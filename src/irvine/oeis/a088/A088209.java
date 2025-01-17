package irvine.oeis.a088;
// Generated by gen_seq4.pl holos at 2021-08-16 19:34

import irvine.oeis.HolonomicRecurrence;
/**
 * A088209 Numerators of convergents of the continued fraction with the n+1 partial quotients: [1;1,1,...(n 1's)...,1,n+1], starting with [1], [1;2], [1;1,3], [1;1,1,4], ...
 * radtorec((-x^3+x+1)/(-x^2-x+1)^2)
 * @author Georg Fischer
 */
public class A088209 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A088209() {
    super(0, "[[0],[-4, 1],[-5, 1],[6,-2],[-1,-2],[-3],[0, 1]]", "[1, 3, 7, 14, 28, 53, 99, 181]", 0);
  }
}
