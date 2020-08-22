package irvine.oeis.a078;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: x*(32*x^4+16*x^3+12*x^2-4*x-2)/(10*x^2-1)
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A078222 a(1) = 2, a(n+1) &gt; a(n) is the smallest multiple of a(n) using only even digits.
 * @author Georg Fischer
 */
public class A078222 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A078222() {
    super(1, "[0,2,4,-12,-16,-32]", "[1,0,-10]");
  }
}
