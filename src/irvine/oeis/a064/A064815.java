package irvine.oeis.a064;
// Generated by gen_seq4.pl holos [[0],[-40,26,-4],[6,-4],[1]] [1,1,6] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=2*(2*n-3)*a[n-1]+2*(2*n-5)*(n-4)*a[n-2]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A064815 Related to enumeration of finite automata.
 * @author Georg Fischer
 */
public class A064815 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A064815() {
    super(1, "[[0],[-40,26,-4],[6,-4],[1]]", "[1,1,6]", 0);
  }
}
