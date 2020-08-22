package irvine.oeis.a084;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A084086 Length of lists created by n substitutions k -&gt; Range[ -1-Abs[k]+MoebiusMu[Abs[k]],k+1+MoebiusMu[Abs[k]],2] starting with {-1}.
 * @author Georg Fischer
 */
public class A084086 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A084086() {
    super(0, new long[] {-1, 3, -2, -2},
      new long[] {-1, 5, -7, 2});
  }
}
