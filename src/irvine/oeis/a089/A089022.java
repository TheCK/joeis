package irvine.oeis.a089;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: 4/(1+3*sqrt(1-8*x))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A089022 Number of walks of length 2n on the 3-regular tree beginning and ending at some fixed vertex.
 * @author Georg Fischer
 */
public class A089022 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A089022() {
    super(0, "[[0],[36,72],[-22,-17],[2,1]]", "[1,3,15,87]", 2);
  }
}
