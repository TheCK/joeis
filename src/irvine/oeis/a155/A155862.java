package irvine.oeis.a155;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: 2/(3*sqrt(1-6*x+x^2)+x-1)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A155862 A 'Morgan Voyce' transform of A007854.
 * @author Georg Fischer
 */
public class A155862 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A155862() {
    super(0, "[[0],[4,6,2],[-70,-81,-23],[138,201,57],[984,483,57],[-412,-195,-23],[40,18,2]]", "[1,4,22,130,790,4870,30274]", 5);
  }
}
