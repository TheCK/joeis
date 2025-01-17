package irvine.oeis.a263;
// Generated by gen_seq4.pl eumapgf at 2020-11-29 21:38
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.GeneratingFunctionSequence;


/**
 * A263414 Expansion of Product_{k&gt;=1} 1/(1-x^(3*k+4))^k.
 * ET(ogf=-x^6/(-x^6+2*x^3-1), order=7)
 * @author Georg Fischer
 */
public class A263414 extends EulerTransform {

  /** Construct the sequence. */
  public A263414() {
    super(new GeneratingFunctionSequence(0, "[0, 0, 0, 0, 0, 0, 1]", "[1, 0, 0,-2, 0, 0, 1]"), new long[]{1});
  }
}
