package irvine.oeis.a345;
// Generated by gen_seq4.pl holos at 2021-08-16 19:34

import irvine.oeis.HolonomicRecurrence;
/**
 * A345458 a(n) = Sum_{k=0..n} binomial(5*n+4,5*k).
 * radtorec((-16*x^2+106*x+1)/(1-32*x)/(-x^2+11*x+1))
 * @author Georg Fischer
 */
public class A345458 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A345458() {
    super(0, "[[0],[-2048, 512],[29376,-9040],[-73492, 37050],[-4516, 2595],[212,-85],[0,-1]]", "[1, 127, 3004, 107883, 3321891, 107746282, 3431847189, 109996928003]", 0);
  }
}
