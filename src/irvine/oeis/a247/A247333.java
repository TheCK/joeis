package irvine.oeis.a247;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1+x+x^2-sqrt(-3*x^4-6*x^3-5*x^2-2*x+1))/(2*x^2+2*x)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A247333 Number of Dyck paths of semilength n avoiding the consecutive step pattern UDUDU, where U=(1,1) and D=(1,-1).
 * @author Georg Fischer
 */
public class A247333 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A247333() {
    super(0, "[[0],[0,12,6],[72,99,27],[420,326,58],[1074,589,77],[1500,631,65],[1164,393,33],[366,101,7],[-96,-28,-2],[-72,-17,-1]]", "[1,1,2,4,11,31,92,283,893,2875]", 8);
  }
}
