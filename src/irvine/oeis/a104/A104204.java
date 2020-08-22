package irvine.oeis.a104;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A104204 If n==0 (mod 3) then a(n)=a(n-1); if n==1 (mod 3) then a(n)=a(n-2)+a(n-3); if n==2 (mod 3) then a(n)=a(n-3)+a(n-4)+a(n-5).
 * @author Georg Fischer
 */
public class A104204 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A104204() {
    super(0, new long[] {1, 1, 2, 1, 3, 0, -3, -2, 2, 2, -1, -1},
      new long[] {1, 0, 0, -2, 0, 0, -1, 0, 0, 1});
  }
}
