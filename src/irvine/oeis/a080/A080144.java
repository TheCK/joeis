package irvine.oeis.a080;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (x*(8-3*x))/((1-x^2)*(1-3*x+x^2))*seethecommentsection
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A080144 a(n) = F(4)*F(n)*F(n+1) + F(5)*F(n+1)^2 if n odd, a(n) = F(4)*F(n)*F(n+1) + F(5)*F(n+1)^2 - F(5) if n even, where F(n) is the n-th Fibonacci number (A000045).
 * @author Georg Fischer
 */
public class A080144 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A080144() {
    super(0, "[[0],[6,3],[-50,-17],[96,24],[18,9],[-102,-27],[32,8]]", "[0,8,21,63,165,440,1152]", 5);
  }
}
