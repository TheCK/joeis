package irvine.oeis.a307;
// Generated by gen_seq4.pl eumapgf at 2020-11-29 21:38
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.GeneratingFunctionSequence;


/**
 * A307484 Expansion of Product_{k&gt;=1} 1/(1+x^k)^((-1)^k*k^2).
 * ET(ogf=-(-x^7+2*x^6+5*x^4-5*x^3-2*x+1)/(-x^9-3*x^8-6*x^7-10*x^6-12*x^5-12*x^4-10*x^3-6*x^2-3*x-1), order=10)
 * @author Georg Fischer
 */
public class A307484 extends EulerTransform {

  /** Construct the sequence. */
  public A307484() {
    super(new GeneratingFunctionSequence(0, "[1,-2, 0,-5, 5, 0, 2,-1]", "[1, 3, 6, 10, 12, 12, 10, 6, 3, 1]"), new long[]{1});
  }
}
