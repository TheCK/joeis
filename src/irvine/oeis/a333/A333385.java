package irvine.oeis.a333;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: (3-23*x)/((1-3*x)*(1-17*x))
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A333385 a(n) = 3^n + 2 * 17^n for n &gt;= 0.
 * @author Georg Fischer
 */
public class A333385 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A333385() {
    super(0, "[3,-23]", "[1,-20,51]");
  }
}
