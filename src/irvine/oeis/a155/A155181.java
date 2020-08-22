package irvine.oeis.a155;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A155181 a(n)=5*a(n-1)+a(n-2), n&gt;2 ; a(0)=1, a(1)=4, a(2)=20 .
 * @author Georg Fischer
 */
public class A155181 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A155181() {
    super(0, new long[] {1, -1, -1},
      new long[] {1, -5, -1});
  }
}
