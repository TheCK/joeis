package irvine.oeis.a073;
// Generated by gen_seq4.pl lingf at 2021-08-18 17:31
// : 

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A073997 Number of strings of length n over GF(4) with trace 1 and subtrace 0.
 * @author Georg Fischer
 */
public class A073997 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A073997() {
    super(1, "[0, 1,-4, 3,-2]", "[1,-6, 12,-24, 32]");
  }
}
