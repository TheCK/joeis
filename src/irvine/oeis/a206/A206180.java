package irvine.oeis.a206;
// Generated by gen_seq4.pl holos [[0],[-448,-1088,-832,-192],[-540,-929,-528,-99],[-296,-464,-228,-36],[36,51,22,3]] [1,4,34,352] 3 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A206180 a(n) = Sum_{k=0..n} binomial(n,k)^3 * 3^k.
 * @author Georg Fischer
 */
public class A206180 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A206180() {
    super(0, "[[0],[-448,-1088,-832,-192],[-540,-929,-528,-99],[-296,-464,-228,-36],[36,51,22,3]]", "[1,4,34,352]", 3);
  }
}
