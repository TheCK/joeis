package irvine.oeis.a126;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: ((1+3*x)*(1-sqrt(1-4*x^2)))/(2*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A126324 a(2n) = Cat(n), a(2n+1) = 3*Cat(n), where Cat(n) = binomial(2n,n)/(n+1) are the Catalan numbers (A000108).
 * @author Georg Fischer
 */
public class A126324 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A126324() {
    super(0, "[[0],[0,36,36],[72,96,24],[21,-8,-5],[-63,-42,-6],[-24,-10,-1]]", "[1,3,1,3,2,6]", 4);
  }
}
