package irvine.oeis.a082;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1+9*x-sqrt(81*x^2-22*x+1))/(20*x)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A082148 a(0)=1; for n &gt;= 1, a(n) = Sum_{k=0..n} 10^k*N(n,k), where N(n,k) = (1/n)*C(n,k)*C(n,k+1) are the Narayana numbers (A001263).
 * @author Georg Fischer
 */
public class A082148 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A082148() {
    super(0, "[[0],[0,729,729],[-540,-819,-279],[192,157,31],[-12,-7,-1]]", "[1,1,11,131,1661]", 3);
  }
}
