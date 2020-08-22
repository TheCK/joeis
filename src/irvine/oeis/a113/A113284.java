package irvine.oeis.a113;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (((1+x)/(1-x)/(1-6*x+x^2)*(1-x-(1-6*x+x^2)^(1/2)))/2/x)^(1/2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A113284 Odd bisection of A113281: a(n) = A113281(2*n+1).
 * @author Georg Fischer
 */
public class A113284 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A113284() {
    super(0, "[[0],[3,5,2],[-15,-30,-12],[-120,-57,-2],[300,180,24],[195,27,-2],[-465,-150,-12],[78,25,2]]", "[1,5,23,113,579,3047,16319,88489]", 6);
  }
}
