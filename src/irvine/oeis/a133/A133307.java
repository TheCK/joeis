package irvine.oeis.a133;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1-x-sqrt(x^2-26*x+1))/(12*x)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A133307 a(n) = (1/n)*Sum_{i=0..n-1} C(n,i)*C(n,i+1)*6^i*7^(n-i), a(0)=1.
 * @author Georg Fischer
 */
public class A133307 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A133307() {
    super(0, "[[0],[0,1,1],[-36,-61,-25],[-192,-139,-25],[12,7,1]]", "[1,7,91,1477,26845]", 3);
  }
}
