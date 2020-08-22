package irvine.oeis.a109;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1-x-sqrt(1-2*x-3*x^2))/(1-2*x-3*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A109194 Number of returns to the x-axis (i.e., d or u steps hitting the x-axis) in all Grand Motzkin paths of length n. (A Grand Motzkin path of length n is a path in the half-plane x&gt;=0, starting at (0,0), ending at (n,0) and consisting of steps u=(1,1), d=(1,-1) and h=(1,0).).
 * @author Georg Fischer
 */
public class A109194 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A109194() {
    super(2, "[[0],[9,9],[21,12],[-5,-2],[-13,-4],[4,1]]", "[2,6,22,70,224,700]", 4);
  }
}
