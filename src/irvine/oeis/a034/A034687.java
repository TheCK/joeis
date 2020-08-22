package irvine.oeis.a034;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (-1+(1-25*x)^(-1/5))/5
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A034687 Related to quintic factorial numbers A008548.
 * @author Georg Fischer
 */
public class A034687 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A034687() {
    super(1, "[[0],[0],[30,25],[-2,-1]]", "[1,15,275,5500]", 2);
  }
}
