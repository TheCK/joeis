package irvine.oeis.a227;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: (1165+772926*x+4259002*x^2-23338464*x^3+8025448*x^4+35155008*x^5+2325120*x^6)/((1-x)*(1-2*x)^3*(1-4*x)^3)
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A227485 The hyper-Wiener index of the dendrimer D_4[n], defined pictorially in the A. R. Ashrafi et al. reference.
 * @author Georg Fischer
 */
public class A227485 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A227485() {
    super(0, "[1165,772926,4259002,-23338464,8025448,35155008,2325120]", "[1,-19,150,-636,1560,-2208,1664,-512]");
  }
}
