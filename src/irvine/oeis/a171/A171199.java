package irvine.oeis.a171;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1+x^2-sqrt(1-4*x-2*x^2+x^4))/(2*x)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A171199 G.f. satisfies: A(x) = exp( Sum_{n&gt;=1} [A(x)^n + A(x)^-n]*x^n/n ).
 * @author Georg Fischer
 */
public class A171199 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A171199() {
    super(0, "[[0],[-2,0,2],[0,9,3],[-18,-24,-6],[-96,-81,-15],[-72,-42,-6],[344,135,13],[112,30,2],[-56,-15,-1]]", "[1,2,3,8,25,83,289,1041,3847]", 7);
  }
}
