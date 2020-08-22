package irvine.oeis.a050;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: x*((-x^2+4*x+1)/(2*sqrt(x^2-6*x+1))-x/2+1/2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A050147 a(n) = T(n,n-1), array T as in A050143. Also T(2n+1,n), array T as in A055807.
 * @author Georg Fischer
 */
public class A050147 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A050147() {
    super(1, "[[0],[-6,-3,3],[6,7,-19],[6,15,9],[-2,-3,-1]]", "[1,3,12,56,280]", 3);
  }
}
