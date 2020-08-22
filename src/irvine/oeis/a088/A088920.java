package irvine.oeis.a088;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: (2x^2-20x+2)/((1-x)(1-34x+x^2))
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A088920 Solutions k to the Diophantine equation k = 2n^2 = m^2+1.
 * @author Georg Fischer
 */
public class A088920 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A088920() {
    super(1, "[0,2,-20,2]", "[1,-35,35,-1]");
  }
}
