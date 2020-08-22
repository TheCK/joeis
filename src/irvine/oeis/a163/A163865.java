package irvine.oeis.a163;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1-x-4*x^2)/((1+x)*(1-3*x))^(3/2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A163865 The binomial transform of the swinging factorial (A056040).
 * @author Georg Fischer
 */
public class A163865 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A163865() {
    super(0, "[[0],[12,12],[13,11],[-10,-5],[-11,-3],[4,1]]", "[1,2,5,16,47,146]", 4);
  }
}
