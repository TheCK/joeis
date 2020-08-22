package irvine.oeis.a082;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1+8*x-sqrt(64*x^2-20*x+1))/(18*x)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A082181 a(0)=1; for n&gt;=1, a(n) = sum(k=0..n, 9^k*N(n,k)), where N(n,k) =1/n*C(n,k)*C(n,k+1) are the Narayana numbers (A001263).
 * @author Georg Fischer
 */
public class A082181 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A082181() {
    super(0, "[[0],[0,512,512],[-432,-656,-224],[174,142,28],[-12,-7,-1]]", "[1,1,10,109,1270]", 3);
  }
}
