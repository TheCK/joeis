package irvine.oeis.a089;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: 2/((1-x)^2+sqrt(1-6*x^2+x^4))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A089324 Number of lattice paths from (0,0) to the line x+y=n that use the step set {(0,1),(1,0),(2,0),(3,0),...} and never pass below y=x.
 * @author Georg Fischer
 */
public class A089324 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A089324() {
    super(0, "[[0],[2,3,1],[-38,-33,-7],[50,39,7],[720,348,42],[-1908,-834,-90],[-756,-126],[4860,1326,90],[-2592,-660,-42],[-590,-129,-7],[650,135,7],[-110,-21,-1]]", "[1,1,2,3,7,12,29,53,130,247,611,1192]", 10);
  }
}
