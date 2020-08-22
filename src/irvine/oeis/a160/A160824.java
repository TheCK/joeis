package irvine.oeis.a160;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: (-8*x^5+7*x^4-4*x^3-x^2+5*x+1)/(-2*x^2+1)
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A160824 a(1)=1, a(n) = the smallest positive integer such that both a(n) and Sum_{k=1..n} a(k) have the same number of (nonleading) 0's when they are represented in binary.
 * @author Georg Fischer
 */
public class A160824 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A160824() {
    super(1, "[0,1,5,-1,-4,7,-8]", "[1,0,-2]");
  }
}
