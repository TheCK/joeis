package irvine.oeis.a305;
// Generated by gen_seq4.pl stirling2 at 2020-09-22 11:35
// DO NOT EDIT here!

import irvine.oeis.transform.Stirling2TransformSequence;
import irvine.oeis.a007.A007838;


/**
 * A305987 Expansion of e.g.f. Product_{k&gt;=1} (1 + (exp(x) - 1)^k/k).
 * @author Georg Fischer
 */
public class A305987 extends Stirling2TransformSequence {

  /** Construct the sequence. */
  public A305987() {
    super(new A007838(), 0);
  }
}
