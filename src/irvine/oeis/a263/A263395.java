package irvine.oeis.a263;
// Generated by gen_seq4.pl eumapgf at 2020-11-29 21:38
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.GeneratingFunctionSequence;


/**
 * A263395 Expansion of Product_{k&gt;=1} 1/(1 - x^(2*k+5))^k.
 * ET(ogf=-x^6/(-x^4+2*x^2-1), order=5)
 * @author Georg Fischer
 */
public class A263395 extends EulerTransform {

  /** Construct the sequence. */
  public A263395() {
    super(new GeneratingFunctionSequence(0, "[0, 0, 0, 0, 0, 0, 1]", "[1, 0,-2, 0, 1]"), new long[]{1});
  }
}
