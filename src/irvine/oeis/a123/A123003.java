package irvine.oeis.a123;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A123003 G.f.: (8-29*x+24*x^2)/((1-4*x)*(1-3*x)*(1-2*x)^2*(1-x)^2). 
 * @author Georg Fischer
 */
public class A123003 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123003() {
    super(new long[] {-48L, 172L, -244L, 175L, -67L, 13L}, new long[] {8L, 75L, 463L, 2394L, 11274L, 50265L});
  } // constructor()
} // A123003
