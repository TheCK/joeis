package irvine.oeis.a345;
// Generated by gen_seq4.pl holos at 2021-08-16 19:34

import irvine.oeis.HolonomicRecurrence;
/**
 * A345455 a(n) = Sum_{k=0..n} binomial(5*n+1,5*k).
 * radtorec((-26*x^2-14*x+1)/(1-32*x)/(-x^2+11*x+1))
 * @author Georg Fischer
 */
public class A345455 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A345455() {
    super(0, "[[0],[-3328, 832],[35816,-8730],[12068,-5520],[484, 85],[-28, 35],[0,-1]]", "[1, 7, 474, 12393, 427351, 13333932, 430470899, 13733091643]", 0);
  }
}
