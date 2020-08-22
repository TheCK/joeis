package irvine.oeis.a158;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A158935 a(n)= -3a(n-1)-3a(n-2)-2a(n-3), n&gt;3. a(0)=4, a(1)=4, a(2)=-5, a(3)=4.
 * @author Georg Fischer
 */
public class A158935 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A158935() {
    super(0, new long[] {4, 16, 19, 9},
      new long[] {1, 3, 3, 2});
  }
}
