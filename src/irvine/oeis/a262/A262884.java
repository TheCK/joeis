package irvine.oeis.a262;
// Generated by gen_seq4.pl eumapgf at 2020-11-29 21:38
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.GeneratingFunctionSequence;


/**
 * A262884 Expansion of Product_{k&gt;=1} ((1+x^(3*k-1))*(1+x^(3*k-2)))^k.
 * ET(ogf=-(x^7+x^6+2*x^4+x^3+1)/(-x^12+2*x^6-1), order=13)
 * @author Georg Fischer
 */
public class A262884 extends EulerTransform {

  /** Construct the sequence. */
  public A262884() {
    super(new GeneratingFunctionSequence(0, "[1, 0, 0, 1, 2, 0, 1, 1]", "[1, 0, 0, 0, 0, 0,-2, 0, 0, 0, 0, 0, 1]"), new long[]{1});
  }
}
