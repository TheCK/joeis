package irvine.oeis.a132;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp((1-(1-x)^6)/(6*(1-x)^6))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A132164 Row sums of triangle A134141 (S1p(7)).
 * @author Georg Fischer
 */
public class A132164 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A132164() {
    super(0, "[[0],[0,1],[-7,-7],[42,21],[-105,-35],[140,35],[-105,-21],[43,7],[-7,-1]]", "[1,1,8,78,918,12846,209616,3909228,81859548]", 7);
    setGfType(1);
  }
}
