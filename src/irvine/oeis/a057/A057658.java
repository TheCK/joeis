package irvine.oeis.a057;
// Generated by gen_seq4.pl holos [0,1,-10,45,-120,210,-252,210,-120,45,-10,1] [0,8640,172800,1512000,8467200,35562240,121927680,359251200,940896000,2242468800] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A057658 a(n) = n*(n+1)^2*(n+2)^3*(n+3)^2*(n+4).
 * @author Georg Fischer
 */
public class A057658 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A057658() {
    super(1, "[0,1,-10,45,-120,210,-252,210,-120,45,-10,1]", "[0,8640,172800,1512000,8467200,35562240,121927680,359251200,940896000,2242468800]", 0);
  }
}
