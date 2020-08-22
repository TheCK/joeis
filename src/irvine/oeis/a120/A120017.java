package irvine.oeis.a120;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1-sqrt(1-(4*x*(1-x))/(1-2*x+2*x^2)))/2
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A120017 The 2nd self-composition of A120010; g.f.: A(x) = G(G(x)), where G(x) = g.f. of A120010.
 * @author Georg Fischer
 */
public class A120017 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A120017() {
    super(1, "[[0],[0,48,24],[-144,-204,-60],[336,296,64],[-312,-212,-36],[136,74,10],[-20,-9,-1]]", "[1,2,4,10,32,116,440]", 5);
  }
}
