package irvine.oeis.a305;
// Generated by gen_seq4.pl stirling2 at 2020-09-22 11:35
// DO NOT EDIT here!

import irvine.oeis.transform.Stirling2TransformSequence;
import irvine.oeis.a001.A001405;


/**
 * A305560 Expansion of Sum_{k&gt;=0} binomial(k,floor(k/2))*x^k/Product_{j=1..k} (1 - j*x).
 * @author Georg Fischer
 */
public class A305560 extends Stirling2TransformSequence {

  /** Construct the sequence. */
  public A305560() {
    super(new A001405(), 0);
  }
}
