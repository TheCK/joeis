package irvine.oeis.a193;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: log(1-x)^2/(1-x)^2
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A193446 a(n) = n! * Sum_{k=1..n-1} H(k)*H(n-k) for n&gt;=2, where H(n) is the n-th harmonic number.
 * @author Georg Fischer
 */
public class A193446 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A193446() {
    super(2, "[[0],[8,12,6,1],[-19,-34,-18,-3],[18,33,18,3],[-6,-11,-6,-1]]", "[2,18,142,1160,10208]", 3);
    setGfType(1);
  }
}
